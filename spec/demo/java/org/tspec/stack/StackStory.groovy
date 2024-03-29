package org.tspec.stack

import com.centillex.tspec.stack.* 

เรื่อง 'แสต็ก'

อธิบาย 'เมื่อค่าว่างถูกวางเข้าไปยังแสต็กว่าง', {
	กำหนดให้ 'แสต็กว่าง', {
		stack = new Stack()
	}

	เมื่อ 'ค่าว่างถูกใส่', {
		pushnull = {
			stack.push(null)
		}
	}

	แล้วควร 'มีการขว้างข้อผิดพลาด', {
		รับรองว่าขว้าง RuntimeException, {
			pushnull()
		}
	}

	และควร 'ที่แสต็กจะยังว่างอยู่', {
		stack.empty.should == true
	}
}

อธิบาย 'เมื่อเมธอด pop ถูกเรียกตอนแสต็กว่าง', {
	กำหนดให้ 'แสต็กว่าง',{
		stack = new Stack()	  
	}

	เมื่อ 'เมธอด pop ถูกเรียก', {
		popnull = {
			stack.pop()
		}
	}

	แล้วควร 'มีการขว้างข้อผิดพลาด', {
		รับรองว่าขว้าง RuntimeException, {
			popnull()
		}
	}

	และควร 'ที่แสต็กจะยังว่างอยู่', {
		stack.empty.should == true
	}
}

อธิบาย 'เมื่อมีการใส่ค่า 1 ลงในแสต็กว่าง', {
	
	กำหนดให้ 'แสต็กว่าง',{
		stack = new Stack()	  
	}

	เมื่อ 'ค่า 1 ถูกใส่ลงในแสต็ก', {
		push_value_1 = {
			stack.push(1)
		}
	}
	 
	แล้ว 'ค่าบนสุดของแสต็กควรจะมีค่า 1', {
		push_value_1()
		stack.peek().should == 1
	}

	และ 'แสต็กควรจะมีขนาดเป็น 1', {
		stack.size().should == 1
	}
	
	และ 'เมื่อเรียก pop แล้วค่าที่ได้ควรเท่ากับ 1', {
		stack.pop().should == 1
	}
	
	แล้ว 'หลังจากนั้นแสต็กควรว่าง', {
		stack.empty.should == true
	}
}

