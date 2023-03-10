package ch09.lecture.p02anonymous;

public class C04Anonymous {
	public static void main(String[] args) {
		class SubClass04 extends MyClass04 {
			@Override
			void method1() {
				System.out.println("override");
			}
		}
		//5-10line이 생략된 것이다
		
		
		MyClass04 o1 = new SubClass04();
		o1.method1();
	}
}


abstract class MyClass04 {
	abstract void method1();
}
