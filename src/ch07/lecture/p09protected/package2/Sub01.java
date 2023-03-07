package ch07.lecture.p09protected.package2;

import ch07.lecture.p09protected.package1.*;

public class Sub01 extends Super01{
	public void method2() {
		method1(); //된다
	}
	
	public void method3() {
		method1();
		Super01 o1 = new Super01(); //객체 생성해서 사용하는 것은 안된다
		o1.method1();
		
	}
}
