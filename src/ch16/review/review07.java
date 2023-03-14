package ch16.review;

public class review07 {
	public static void main(String[] args) {
		//method reference
		Inter07 o1 = MyClass07::method1;
		
		o1.action1();
		o1.action2();
		System.out.println();
		
		//lambda expression
		Inter07 o2 = () -> MyClass07.method1();
		
		o2.action1();
		o2.action2();
		System.out.println();
		
		//anonymous class
		Inter07 o3 = new Inter07() {
			@Override
			public void action1() {
				System.out.println("method1 실행");
			}
		};
		
		o3.action1();
		o3.action2();
		System.out.println();
		
		//origin
		Inter07 o4 = new MyClass08();
		
		o4.action1();
		
		
		o4.action2();
		System.out.println();
	}
}


interface Inter07 {
	void action1();
	
	default void action2() {
		System.out.println("action2 실행");
	}
}

class MyClass07 {
	public static void method1() {
		System.out.println("method1 실행");
	}
}

class MyClass08 implements Inter07{
	@Override
	public void action1() {
		System.out.println("method1 실행");
	}
}