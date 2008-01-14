package org.codehaus.groovy.aop.asm;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.groovy.aop.parser.ClassTypeResolver;
import org.objectweb.asm.Type;

public class ReplaceCall {

	private String className;
	private String methodName;
	private List<Arg> argList = new ArrayList<Arg>();

	private String newInvoker;
	private int lexIndex;
	private ClassTypeResolver resolver;

	public static class Arg {

		private String typeCast;
		private String name;
		private int index;
		private boolean wrapped;

		public String getTypeCast() {
			return typeCast;
		}
		public String getCastInternalName() {
			return typeCast.replace('.', '/');
		}

		public void setTypeCast(String typeCast) {
			this.typeCast = typeCast;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setIndex(int index) {
			this.index = index;
		}

		public void setWrapped(boolean wrapped) {
			this.wrapped = wrapped;
		}

		public int getIndex() {
			return index;
		}

		public boolean isWrapped() {
			return wrapped;
		}
	}


	public ReplaceCall(ClassTypeResolver resolver, String newInvoker) {
		this.resolver = resolver;
		this.newInvoker = newInvoker;
		this.lexIndex = -1;
		try {
			parse();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void parse() throws Exception {
		className();
		$('#');
		methodName();
		$('(');
		argList();
		$(')');
		$(';');
	}

	private void className() {
		StringBuffer sb = new StringBuffer();
		char ch = LA(1);
		while (ch != '#') {
			sb.append(ch);
			ch = LA(1);
		}
		LA(-1);
		this.className = resolve(sb.toString());
	}

	private void methodName() {
		StringBuffer sb = new StringBuffer();
		char ch = LA(1);
		while (ch != '(') {
			sb.append(ch);
			ch = LA(1);
		}
		LA(-1);
		this.methodName = sb.toString();
	}

	private void argList() throws Exception {
		if($(')')) {
			LA(-1);
			return;
		}
		Arg a = new Arg();
		argList.add(a);
		arg(a);
		char ch = LA(1);
		while (ch != ')') {
			$(',');
			a = new Arg();
			argList.add(a);
			arg(a);
			ch = LA(1);
		}
		LA(-1);
	}

	private void arg(Arg i) throws Exception {
		$('(');
		typeCast(i);
		$(')');
		argName(i);
	}

	private void typeCast(Arg i) {
		StringBuffer sb = new StringBuffer();
		char ch = LA(1);
		while (ch != ')') {
			sb.append(ch);
			ch = LA(1);
		}
		LA(-1);
		try {
			i.setTypeCast(resolver.resolveType(sb.toString()).getCanonicalName());
		} catch (Exception e) {
			i.setTypeCast(sb.toString());
		}
	}

	private void argName(Arg i) throws Exception {
		boolean wrapped = false;
		$('$');
		if ($('[') == true) {
			wrapped = true;
		}
		argIndex(i);
		i.setWrapped(wrapped);
		if (wrapped) {
			$(']');
		}
	}

	private void argIndex(Arg i) {
		StringBuffer sb = new StringBuffer();
		char ch = LA(1);
		while (ch >= '0' && ch <= '9') {
			sb.append(ch);
			ch = LA(1);
		}
		LA(-1);
		i.setIndex(Integer.parseInt(sb.toString()));
	}

	private char LA(int i) {
		lexIndex += i;
		return newInvoker.charAt(lexIndex);
	}

	private boolean $(char c) throws Exception {
		char ch = LA(1);
		while (ch == ' ') {
			ch = LA(1);
		}
		if (ch == c) {
			return true;
		} else {
			LA(-1);
			return false;
		}
	}

	public String getReceiver() {
		return className.replace('.', '/');
	}

	public String getName() {
		return methodName;
	}

	public List<Arg> getArgs() {
		return argList;
	}
	
	public Arg getWrappedArg(int i) {
		for(Arg a: argList) {
			if(a.wrapped==true && a.index==i) {
				return a;
			}
		}
		return null;
	}	

	public String getDesc() {
		try {
			Class<?> c = Class.forName(this.className);
			Class<?>[] types = new Class[argList.size()];
			int i = 0;
			for (Arg a : argList) {
				types[i] = Class.forName(resolve(a.getTypeCast()));
				i++;
			}
			Method m = c.getMethod(this.methodName, types);
			return Type.getMethodDescriptor(m);
		} catch (Exception e) {
			return "";
		}
	}

	// private HashMap<String, String> resolveClasses = new HashMap<String,
	// String>();

	private String resolve(String className) {		
		try {
			return resolver.resolveType(className).getCanonicalName();
		} catch (ClassNotFoundException e) {
			return className;
		}
	}

	public int getWrappedArgs() {
		int i = 0;
		for(Arg a: argList) {
			if(a.isWrapped()) i++;
		}
		return i;
	}

}
