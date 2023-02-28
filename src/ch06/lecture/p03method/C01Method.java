package ch06.lecture.p03method;

import ch06.lecture.p03method.MyClass01;

public class C01Method {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();
		
		// 메소드 호출(실행) call, invoke, execute
		o1.run();
		o1.standUp();
		o1.wakeUp();
		o1.methodName(0);
		
		
		MyClass01 o2 = new MyClass01();
		o2.run();
		o2.standUp();
		o2.wakeUp();
		o2.methodName(0);
	}
}
