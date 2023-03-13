package ch09.lecture.p02anonymous;

public class C08Anonymous {
	public static void main(String[] args) {
		MyInterface08 o1 = new MyInterface08() {
			@Override
			public void method1() {
				System.out.println("메소드 재정의");
			}
		};
		
		o1.method1();
		//인터페이스를 구현하는 클래스없이 익명 클래스로 바로 객체화 가능
	}
}

interface MyInterface08 {
	void method1();
}
