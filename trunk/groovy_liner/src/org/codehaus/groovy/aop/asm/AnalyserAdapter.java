/***
 * ASM: a very small and fast Java bytecode manipulation framework
 * Copyright (c) 2000-2007 INRIA, France Telecom
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 * 3. Neither the name of the copyright holders nor the names of its
 *    contributors may be used to endorse or promote products derived from
 *    this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.codehaus.groovy.aop.asm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodAdapter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

/**
 * A {@link MethodAdapter} that keeps track of stack map frame changes between
 * {@link #visitFrame(int, int, Object[], int, Object[]) visitFrame} calls. This
 * adapter must be used with the
 * {@link org.objectweb.asm.ClassReader#EXPAND_FRAMES} option. Each visit<i>XXX</i>
 * instruction delegates to the next visitor in the chain, if any, and then
 * simulates the effect of this instruction on the stack map frame, represented
 * by {@link #locals} and {@link #stack}. The next visitor in the chain can get
 * the state of the stack map frame <i>before</i> each instruction by reading
 * the value of these fields in its visit<i>XXX</i> methods (this requires a
 * reference to the AnalyzerAdapter that is before it in the chain).
 * 
 * @author Eric Bruneton
 */
public class AnalyserAdapter extends MethodAdapter {

	private static final Item ITEM_TOP = new Item(Opcodes.TOP);

	/**
	 * <code>List</code> of the local variable slots for current execution
	 * frame. Primitive types are represented by {@link Opcodes#TOP},
	 * {@link Opcodes#INTEGER}, {@link Opcodes#FLOAT}, {@link Opcodes#LONG},
	 * {@link Opcodes#DOUBLE},{@link Opcodes#NULL} or
	 * {@link Opcodes#UNINITIALIZED_THIS} (long and double are represented by a
	 * two elements, the second one being TOP). Reference types are represented
	 * by String objects (representing internal names), and uninitialized types
	 * by Label objects (this label designates the NEW instruction that created
	 * this uninitialized value). This field is <tt>null</tt> for unreacheable
	 * instructions.
	 */
	public List<Item> locals;
	public Object[] inferredLocalTypes = new Object[100];

	/**
	 * <code>List</code> of the operand stack slots for current execution
	 * frame. Primitive types are represented by {@link Opcodes#TOP},
	 * {@link Opcodes#INTEGER}, {@link Opcodes#FLOAT}, {@link Opcodes#LONG},
	 * {@link Opcodes#DOUBLE},{@link Opcodes#NULL} or
	 * {@link Opcodes#UNINITIALIZED_THIS} (long and double are represented by a
	 * two elements, the second one being TOP). Reference types are represented
	 * by String objects (representing internal names), and uninitialized types
	 * by Label objects (this label designates the NEW instruction that created
	 * this uninitialized value). This field is <tt>null</tt> for unreacheable
	 * instructions.
	 */
	public List<Item> stack;

	/**
	 * The labels that designate the next instruction to be visited. May be
	 * <tt>null</tt>.
	 */
	private List<Label> labels;

	/**
	 * Information about uninitialized types in the current execution frame.
	 * This map associates internal names to Label objects. Each label
	 * designates a NEW instruction that created the currently uninitialized
	 * types, and the associated internal name represents the NEW operand, i.e.
	 * the final, initialized type value.
	 */
	private final Map<Label, String> uninitializedTypes;

	/**
	 * The maximum stack size of this method.
	 */
	private int maxStack;

	/**
	 * The maximum number of local variables of this method.
	 */
	private int maxLocals;

	public static class Item {

		private Object type;
		private Object value;
		private Object inferredType;
		
		private boolean array;

		public Item(Integer type) {
			this.type = type;
			this.value = null;
		}

		public Item(String owner) {
			this.type = owner;
			this.value = null;
		}

		public Item(Integer type, Integer constValue) {
			this.type = type;
			this.value = constValue;
		}

		public Item(Integer type, Long constValue) {
			this.type = type;
			this.value = constValue;
		}

		public Item(Integer f, Float cst) {
			this.type = f;
			this.value = cst;
		}

		public Item(Integer d, Double cst) {
			this.type = d;
			this.value = cst;
		}

		public Item(String string, String cst) {
			this.type = string;
			this.value = cst;
		}

		public Item(String string, Type cst) {
			this.type = string;
			this.value = cst;
		}

		public Item(Integer type, Short short1) {
			this.type = type;
			this.value = short1;
		}

		public Item(String desc, Array value2) {
			this.type = desc;
			this.value = value2;
			this.array = true;
		}

		public Item(Label label) {
			this.type = label;
		}

		public Item(String desc, Object[] value2) {
			this.type = desc;
			this.value = value2;
			this.array = true;
		}

		public Object getType() {
			return type;
		}

		public void setType(Object type) {
			this.type = type;
		}

		public Object getValue() {
			return value;
		}

		public void setValue(Object value) {
			this.value = value;
		}

		public boolean isArray() {
			return this.array;
		}

		public void setArray(boolean isArray) {
			this.array = isArray;
		}

		public Object getInferredType() {
			return inferredType==null?type:inferredType;
		}

		public void setInferredType(Object inferredType) {			
			this.inferredType = inferredType;
		}
	}

	/**
	 * Creates a new {@link AnalyzerAdapter}.
	 * 
	 * @param owner
	 *            the owner's class name.
	 * @param access
	 *            the method's access flags (see {@link Opcodes}).
	 * @param name
	 *            the method's name.
	 * @param desc
	 *            the method's descriptor (see {@link Type Type}).
	 * @param mv
	 *            the method visitor to which this adapter delegates calls. May
	 *            be <tt>null</tt>.
	 */
	public AnalyserAdapter(final String owner, final int access,
			final String name, final String desc, final MethodVisitor mv) {
		super(mv);
		locals = new ArrayList<Item>();
		stack = new ArrayList<Item>();

		uninitializedTypes = new HashMap<Label, String>();

		if ((access & Opcodes.ACC_STATIC) == 0) {
			if ("<init>".equals(name)) {
				locals.add(new Item(Opcodes.UNINITIALIZED_THIS));
			} else {
				locals.add(new Item(owner));
			}
		}
		Type[] types = Type.getArgumentTypes(desc);
		for (int i = 0; i < types.length; ++i) {
			Type type = types[i];
			switch (type.getSort()) {
			case Type.BOOLEAN:
			case Type.CHAR:
			case Type.BYTE:
			case Type.SHORT:
			case Type.INT:
				locals.add(new Item(Opcodes.INTEGER));
				break;
			case Type.FLOAT:
				locals.add(new Item(Opcodes.FLOAT));
				break;
			case Type.LONG:
				locals.add(new Item(Opcodes.LONG));
				locals.add(ITEM_TOP);
				break;
			case Type.DOUBLE:
				locals.add(new Item(Opcodes.DOUBLE));
				locals.add(ITEM_TOP);
				break;
			case Type.ARRAY:
				locals.add(new Item(types[i].getDescriptor()));
				break;
			// case Type.OBJECT:
			default:
				locals.add(new Item(types[i].getInternalName()));
			}
		}
	}

	public void visitFrame(final int type, final int nLocal,
			final Object[] local, final int nStack, final Object[] stack) {
		if (type != Opcodes.F_NEW) { // uncompressed frame
			throw new IllegalStateException(
					"ClassReader.accept() should be called with EXPAND_FRAMES flag");
		}

		if (mv != null) {
			mv.visitFrame(type, nLocal, local, nStack, stack);
		}

		if (this.locals != null) {
			System.out.println("!! Clear Locals !!");
			this.locals.clear();
			this.stack.clear();
		} else {
			System.out.println("!! New Locals !!");			
			this.locals = new ArrayList<Item>();
			this.stack = new ArrayList<Item>();
		}
		visitFrameTypes(nLocal, local, this.locals);
		visitFrameTypes(nStack, stack, this.stack);
		maxStack = Math.max(maxStack, this.stack.size());
	}

	private static void visitFrameTypes(final int n, final Object[] types,
			final List<Item> result) {
		for (int i = 0; i < n; ++i) {
			Object type = types[i];
			if (type instanceof String) {
				result.add(new Item((String) type));
			} else {
				result.add(new Item((Integer) type));
			}
			if (type == Opcodes.LONG || type == Opcodes.DOUBLE) {
				result.add(ITEM_TOP);
			}
		}
	}

	public void visitInsn(final int opcode) {
		if (mv != null) {
			mv.visitInsn(opcode);
		}
		execute(opcode, 0, null);
		if ((opcode >= Opcodes.IRETURN && opcode <= Opcodes.RETURN) || opcode == Opcodes.ATHROW) {
			System.out.println("!! Destroy Locals !!");			
			this.locals = null;
			this.stack = null;
		}
	}

	public void visitIntInsn(final int opcode, final int operand) {
		if (mv != null) {
			mv.visitIntInsn(opcode, operand);
		}
		execute(opcode, operand, null);
	}

	public void visitVarInsn(final int opcode, final int var) {
		if (mv != null) {
			mv.visitVarInsn(opcode, var);
		}
		execute(opcode, var, null);
	}

	public void visitTypeInsn(final int opcode, final String type) {
		if (opcode == Opcodes.NEW) {
			if (labels == null) {
				Label l = new Label();
				labels = new ArrayList<Label>(3);
				labels.add(l);
				if (mv != null) {
					mv.visitLabel(l);
				}
			}
			for (int i = 0; i < labels.size(); ++i) {
				uninitializedTypes.put(labels.get(i), type);
			}
		}
		if (mv != null) {
			mv.visitTypeInsn(opcode, type);
		}
		execute(opcode, 0, type);
	}

	public void visitFieldInsn(final int opcode, final String owner,
			final String name, final String desc) {
		if (mv != null) {
			mv.visitFieldInsn(opcode, owner, name, desc);
		}
		execute(opcode, 0, desc);
	}

	public void visitMethodInsn(final int opcode, final String owner,
			final String name, final String desc) {
		// TODO no need to analyse constructor
		// TODO because type information is enough for matching
		if (mv != null) {
			mv.visitMethodInsn(opcode, owner, name, desc);
		}
		pop(desc);
		if (opcode != Opcodes.INVOKESTATIC) {
			Item t = pop();
			if (opcode == Opcodes.INVOKESPECIAL && name.charAt(0) == '<') {
				Object u;
				if (t.getType() == Opcodes.UNINITIALIZED_THIS) {
					u = owner;
				} else {
					u = uninitializedTypes.get(t);
				}
				for (int i = 0; i < locals.size(); ++i) {
					if (locals.get(i) == t) {
						if (u instanceof Integer)
							locals.set(i, new Item((Integer) u));
						else if (u instanceof String)
							locals.set(i, new Item((String) u));
					}
				}
				for (int i = 0; i < stack.size(); ++i) {
					if (stack.get(i) == t) {
						if (u instanceof Integer)
							stack.set(i, new Item((Integer) u));
						else if (u instanceof String)
							stack.set(i, new Item((String) u));

					}
				}
			}
		}
		pushDesc(desc);
		labels = null;
	}

	public void visitJumpInsn(final int opcode, final Label label) {
		if (mv != null) {
			mv.visitJumpInsn(opcode, label);
		}
		execute(opcode, 0, null);
		if (opcode == Opcodes.GOTO) {
			System.out.println("!! Destroy Locals !!");						
			this.locals = null;
			this.stack = null;
		}
	}

	public void visitLabel(final Label label) {
		if (mv != null) {
			mv.visitLabel(label);
		}
		if (labels == null) {
			labels = new ArrayList<Label>(3);
		}
		labels.add(label);
	}

	public void visitLdcInsn(final Object cst) {
		if (mv != null) {
			mv.visitLdcInsn(cst);
		}
		if (cst instanceof Integer) {
			push(new Item(Opcodes.INTEGER, (Integer) cst));
		} else if (cst instanceof Long) {
			push(new Item(Opcodes.LONG, (Long) cst));
			push(ITEM_TOP);
		} else if (cst instanceof Float) {
			push(new Item(Opcodes.FLOAT, (Float) cst));
		} else if (cst instanceof Double) {
			push(new Item(Opcodes.DOUBLE, (Double) cst));
			push(ITEM_TOP);
		} else if (cst instanceof String) {
			push(new Item("java/lang/String", (String) cst));
		} else if (cst instanceof Type) {
			push(new Item("java/lang/Class", (Type) cst));
		} else {
			throw new IllegalArgumentException();
		}
		labels = null;
	}

	public void visitIincInsn(final int var, final int increment) {
		if (mv != null) {
			mv.visitIincInsn(var, increment);
		}
		execute(Opcodes.IINC, var, null);
	}

	public void visitTableSwitchInsn(final int min, final int max,
			final Label dflt, final Label[] labels) {
		if (mv != null) {
			mv.visitTableSwitchInsn(min, max, dflt, labels);
		}
		execute(Opcodes.TABLESWITCH, 0, null);
		this.locals = null;
		this.stack = null;
	}

	public void visitLookupSwitchInsn(final Label dflt, final int[] keys,
			final Label[] labels) {
		if (mv != null) {
			mv.visitLookupSwitchInsn(dflt, keys, labels);
		}
		execute(Opcodes.LOOKUPSWITCH, 0, null);
		this.locals = null;
		this.stack = null;
	}

	public void visitMultiANewArrayInsn(final String desc, final int dims) {
		if (mv != null) {
			mv.visitMultiANewArrayInsn(desc, dims);
		}
		execute(Opcodes.MULTIANEWARRAY, dims, desc);
	}

	public void visitMaxs(final int maxStack, final int maxLocals) {
		if (mv != null) {
			this.maxStack = Math.max(this.maxStack, maxStack);
			this.maxLocals = Math.max(this.maxLocals, maxLocals);
			mv.visitMaxs(this.maxStack, this.maxLocals);
		}
	}

	// ------------------------------------------------------------------------

	private Item get(final int local) {
		maxLocals = Math.max(maxLocals, local);
		Item result = local < locals.size() ? locals.get(local) : ITEM_TOP;
		if(inferredLocalTypes[local]==null)
			result.setInferredType(result.getType());
		else
			result.setInferredType(inferredLocalTypes[local]);
		return result;
	}

	private void set(final int local, final Item type) {
		maxLocals = Math.max(maxLocals, local);
		while (local >= locals.size()) {
			locals.add(ITEM_TOP);
		}
		inferredLocalTypes[local] = type.getType();
		if(type.getInferredType()==null) {
			type.setInferredType(type.getType());
		}
		locals.set(local, type);
	}

	private void push(final Item type) {
		stack.add(type);
		maxStack = Math.max(maxStack, stack.size());
	}

	private void pushDesc(final String desc) {
		pushDesc(desc, null);
	}

	private void pushDesc(final String desc, Object value) {
		int index = desc.charAt(0) == '(' ? desc.indexOf(')') + 1 : 0;
		switch (desc.charAt(index)) {
		case 'V':
			return;
		case 'Z':
		case 'C':
		case 'B':
		case 'S':
		case 'I':
			push(new Item(Opcodes.INTEGER, (Integer) value));
			return;
		case 'F':
			push(new Item(Opcodes.FLOAT, (Float) value));
			return;
		case 'J':
			push(new Item(Opcodes.LONG, (Long) value));
			push(ITEM_TOP);
			return;
		case 'D':
			push(new Item(Opcodes.DOUBLE, (Double) value));
			push(ITEM_TOP);
			return;
		case '[':
			if (index == 0) {
				push(new Item(desc, (Object[]) value));
			} else {
				push(new Item(desc.substring(index, desc.length()),
						(Object[]) value));
			}
			break;
		// case 'L':
		default:
			if (index == 0) {
				push(new Item(desc.substring(1, desc.length() - 1)));
			} else {
				push(new Item(desc.substring(index + 1, desc.length() - 1)));
			}
		}
	}

	private Item pop() {
		return stack.remove(stack.size() - 1);
	}

	private void pop(final int n) {
		int size = stack.size();
		int end = size - n;
		for (int i = size - 1; i >= end; --i) {
			stack.remove(i);
		}
	}

	private void pop(final String desc) {
		char c = desc.charAt(0);
		if (c == '(') {
			int n = 0;
			Type[] types = Type.getArgumentTypes(desc);
			for (int i = 0; i < types.length; ++i) {
				n += types[i].getSize();
			}
			pop(n);
		} else if (c == 'J' || c == 'D') {
			pop(2);
		} else {
			pop(1);
		}
	}

	private void execute(final int opcode, final int iarg, final String sarg) {
		if (this.locals == null) {
			return;
		}
		Item t1, t2, t3, t4;
		switch (opcode) {
		case Opcodes.NOP:
		case Opcodes.INEG:
		case Opcodes.LNEG:
		case Opcodes.FNEG:
		case Opcodes.DNEG:
		case Opcodes.I2B:
		case Opcodes.I2C:
		case Opcodes.I2S:
		case Opcodes.GOTO:
		case Opcodes.RETURN:
			break;
		case Opcodes.ACONST_NULL:
			push(new Item(Opcodes.NULL));
			break;
		case Opcodes.ICONST_M1:
		case Opcodes.ICONST_0:
		case Opcodes.ICONST_1:
		case Opcodes.ICONST_2:
		case Opcodes.ICONST_3:
		case Opcodes.ICONST_4:
		case Opcodes.ICONST_5:
			push(new Item(Opcodes.INTEGER, new Integer(opcode
					- Opcodes.ICONST_0)));
			break;
		case Opcodes.BIPUSH:
			push(new Item(Opcodes.INTEGER, new Integer(iarg)));
			break;
		case Opcodes.SIPUSH:
			push(new Item(Opcodes.INTEGER, new Short((short) iarg)));
			break;
		case Opcodes.LCONST_0:
		case Opcodes.LCONST_1:
			push(new Item(Opcodes.LONG, new Long(opcode - Opcodes.LCONST_0)));
			push(ITEM_TOP);
			break;
		case Opcodes.FCONST_0:
		case Opcodes.FCONST_1:
		case Opcodes.FCONST_2:
			push(new Item(Opcodes.FLOAT, new Float(opcode - Opcodes.FCONST_0)));
			break;
		case Opcodes.DCONST_0:
		case Opcodes.DCONST_1:
			push(new Item(Opcodes.DOUBLE, new Double(opcode - Opcodes.DCONST_0)));
			push(ITEM_TOP);
			break;
		case Opcodes.ILOAD:
		case Opcodes.FLOAD:
		case Opcodes.ALOAD:
			t1 = get(iarg);
			if(opcode==Opcodes.ALOAD) {
				System.out.println("ALOAD:" + iarg + ":" + t1.getType());
				System.out.println("Inferred Type:" + iarg + ":" + inferredLocalTypes[iarg]);
			}
			push(t1);
			break;
		case Opcodes.LLOAD:
		case Opcodes.DLOAD:
			push(get(iarg));
			push(ITEM_TOP);
			break;
		case Opcodes.IALOAD:
		case Opcodes.BALOAD:
		case Opcodes.CALOAD:
		case Opcodes.SALOAD: {
			t1 = pop(); // index
			t2 = pop(); // array ref
			int idx = (Integer) t1.getValue();
			int v = Array.getInt(t2.getValue(), idx);
			push(new Item(Opcodes.INTEGER, v)); // TODO array issue
		}
			break;
		case Opcodes.LALOAD:
			pop(2);
			push(new Item(Opcodes.LONG));
			push(ITEM_TOP);
			break;
		case Opcodes.D2L:
			pop(2);
			push(new Item(Opcodes.LONG));
			push(ITEM_TOP);
			break;
		case Opcodes.FALOAD:
			pop(2);
			push(new Item(Opcodes.FLOAT));
			break;
		case Opcodes.DALOAD:
		case Opcodes.L2D:
			pop(2);
			push(new Item(Opcodes.DOUBLE));
			push(ITEM_TOP);
			break;
		case Opcodes.AALOAD:
			pop(1);
			t1 = pop();
			pushDesc(((String) t1.getType()).substring(1));
			break;
		case Opcodes.ISTORE:
		case Opcodes.FSTORE:
		case Opcodes.ASTORE:
			t1 = pop();
			if(opcode == Opcodes.ASTORE) {
				System.out.println("ASTORE:" + iarg +  ":" + t1.getType());
			}
			set(iarg, t1);
			if (iarg > 0) {
				t2 = get(iarg - 1);
				if (t2.getType() == Opcodes.LONG || t2.getType() == Opcodes.DOUBLE) {
					set(iarg - 1, ITEM_TOP);
				}
			}
			break;
		case Opcodes.LSTORE:
		case Opcodes.DSTORE:
			pop(1);
			t1 = pop();
			set(iarg, t1);
			set(iarg + 1, ITEM_TOP);
			if (iarg > 0) {
				t2 = get(iarg - 1);
				if (t2.getType() == Opcodes.LONG || t2.getType() == Opcodes.DOUBLE) {
					set(iarg - 1, ITEM_TOP);
				}
			}
			break;
		case Opcodes.IASTORE:
		case Opcodes.BASTORE:
		case Opcodes.CASTORE:
		case Opcodes.SASTORE:
		case Opcodes.FASTORE:
		case Opcodes.AASTORE:
			t1 = pop();
			t2 = pop();
			t3 = pop();
			if(opcode==Opcodes.AASTORE) {
				System.out.println("AASTORE: " + t1.getType());
			}
			Array.set(t3.getValue(), (Integer) t2.getValue(), t1);
			break;
		case Opcodes.LASTORE:
		case Opcodes.DASTORE:
			pop();
			t1 = pop();
			t2 = pop();
			t3 = pop();
			Array.set(t3.getValue(), (Integer) t2.getValue(), t1);
			break;
		case Opcodes.POP:
		case Opcodes.IFEQ:
		case Opcodes.IFNE:
		case Opcodes.IFLT:
		case Opcodes.IFGE:
		case Opcodes.IFGT:
		case Opcodes.IFLE:
		case Opcodes.IRETURN:
		case Opcodes.FRETURN:
		case Opcodes.ARETURN:
		case Opcodes.TABLESWITCH:
		case Opcodes.LOOKUPSWITCH:
		case Opcodes.ATHROW:
		case Opcodes.MONITORENTER:
		case Opcodes.MONITOREXIT:
		case Opcodes.IFNULL:
		case Opcodes.IFNONNULL:
			pop(1);
			break;
		case Opcodes.POP2:
		case Opcodes.IF_ICMPEQ:
		case Opcodes.IF_ICMPNE:
		case Opcodes.IF_ICMPLT:
		case Opcodes.IF_ICMPGE:
		case Opcodes.IF_ICMPGT:
		case Opcodes.IF_ICMPLE:
		case Opcodes.IF_ACMPEQ:
		case Opcodes.IF_ACMPNE:
		case Opcodes.LRETURN:
		case Opcodes.DRETURN:
			pop(2);
			break;
		case Opcodes.DUP:
			t1 = pop();
			push(t1);
			push(t1);
			break;
		case Opcodes.DUP_X1:
			t1 = pop();
			t2 = pop();
			push(t1);
			push(t2);
			push(t1);
			break;
		case Opcodes.DUP_X2:
			t1 = pop();
			t2 = pop();
			t3 = pop();
			push(t1);
			push(t3);
			push(t2);
			push(t1);
			break;
		case Opcodes.DUP2:
			t1 = pop();
			t2 = pop();
			push(t2);
			push(t1);
			push(t2);
			push(t1);
			break;
		case Opcodes.DUP2_X1:
			t1 = pop();
			t2 = pop();
			t3 = pop();
			push(t2);
			push(t1);
			push(t3);
			push(t2);
			push(t1);
			break;
		case Opcodes.DUP2_X2:
			t1 = pop();
			t2 = pop();
			t3 = pop();
			t4 = pop();
			push(t2);
			push(t1);
			push(t4);
			push(t3);
			push(t2);
			push(t1);
			break;
		case Opcodes.SWAP:
			t1 = pop();
			t2 = pop();
			push(t1);
			push(t2);
			break;
		case Opcodes.IADD:
		case Opcodes.ISUB:
		case Opcodes.IMUL:
		case Opcodes.IDIV:
		case Opcodes.IREM:
		case Opcodes.IAND:
		case Opcodes.IOR:
		case Opcodes.IXOR:
		case Opcodes.ISHL:
		case Opcodes.ISHR:
		case Opcodes.IUSHR:
		case Opcodes.L2I:
		case Opcodes.D2I:
		case Opcodes.FCMPL:
		case Opcodes.FCMPG:
			pop(2);
			push(new Item(Opcodes.INTEGER));
			break;
		case Opcodes.LADD:
		case Opcodes.LSUB:
		case Opcodes.LMUL:
		case Opcodes.LDIV:
		case Opcodes.LREM:
		case Opcodes.LAND:
		case Opcodes.LOR:
		case Opcodes.LXOR:
			pop(4);
			push(new Item(Opcodes.LONG));
			push(ITEM_TOP);
			break;
		case Opcodes.FADD:
		case Opcodes.FSUB:
		case Opcodes.FMUL:
		case Opcodes.FDIV:
		case Opcodes.FREM:
		case Opcodes.L2F:
		case Opcodes.D2F:
			pop(2);
			push(new Item(Opcodes.FLOAT));
			break;
		case Opcodes.DADD:
		case Opcodes.DSUB:
		case Opcodes.DMUL:
		case Opcodes.DDIV:
		case Opcodes.DREM:
			pop(4);
			push(new Item(Opcodes.DOUBLE));
			push(ITEM_TOP);
			break;
		case Opcodes.LSHL:
		case Opcodes.LSHR:
		case Opcodes.LUSHR:
			pop(3);
			push(new Item(Opcodes.LONG));
			push(ITEM_TOP);
			break;
		case Opcodes.IINC: {
			Item l = get(iarg);
			l.value = ((Integer) l.value) + 1;
			set(iarg, l);
		}
			break;
		case Opcodes.I2L: {
			int i = (Integer) pop().getValue();
			push(new Item(Opcodes.LONG, (long) i));
			push(ITEM_TOP);
		}
			break;
		case Opcodes.F2L: {
			float f = (Float) pop().getValue();
			push(new Item(Opcodes.LONG, (long) f));
			push(ITEM_TOP);
		}
			break;
		case Opcodes.I2F:
			pop(1);
			push(new Item(Opcodes.FLOAT));
			break;
		case Opcodes.I2D:
		case Opcodes.F2D:
			pop(1);
			push(new Item(Opcodes.DOUBLE));
			push(ITEM_TOP);
			break;
		case Opcodes.F2I:
		case Opcodes.ARRAYLENGTH:
		case Opcodes.INSTANCEOF:
			pop(1);
			push(new Item(Opcodes.INTEGER));
			break;
		case Opcodes.LCMP:
		case Opcodes.DCMPL:
		case Opcodes.DCMPG:
			pop(4);
			push(new Item(Opcodes.INTEGER));
			break;
		case Opcodes.JSR:
		case Opcodes.RET:
			throw new RuntimeException("JSR/RET are not supported");
		case Opcodes.GETSTATIC:
			pushDesc(sarg);
			break;
		case Opcodes.PUTSTATIC:
			pop(sarg);
			break;
		case Opcodes.GETFIELD:
			pop(1);
			pushDesc(sarg);
			break;
		case Opcodes.PUTFIELD:
			pop(sarg);
			pop();
			break;
		case Opcodes.NEW:
			// push(new Item(labels.get(0)));
			push(new Item(sarg));
			break;
		case Opcodes.NEWARRAY: {
			int size = (Integer) pop().getValue();
			switch (iarg) {
			case Opcodes.T_BOOLEAN:
				pushDesc("[Z", new boolean[size]);
				break;
			case Opcodes.T_CHAR:
				pushDesc("[C", new char[size]);
				break;
			case Opcodes.T_BYTE:
				pushDesc("[B", new byte[size]);
				break;
			case Opcodes.T_SHORT:
				pushDesc("[S", new short[size]);
				break;
			case Opcodes.T_INT:
				pushDesc("[I", new int[size]);
				break;
			case Opcodes.T_FLOAT:
				pushDesc("[F", new float[size]);
				break;
			case Opcodes.T_DOUBLE:
				pushDesc("[D", new double[size]);
				break;
			// case Opcodes.T_LONG:
			default:
				pushDesc("[J", new long[size]);
				break;
			}
		}
			break;
		case Opcodes.ANEWARRAY: {
			int size = (Integer) pop().getValue();
			pushDesc("[" + Type.getObjectType(sarg), new Object[size]);
		}
			break;
		case Opcodes.CHECKCAST:
			pop();
			pushDesc(Type.getObjectType(sarg).getDescriptor());
			break;
		// case Opcodes.MULTIANEWARRAY:
		default:
			pop(iarg);
			pushDesc(sarg);
			break;
		}
		labels = null;
	}
}
