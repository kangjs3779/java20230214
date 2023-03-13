package ch09.review;

public class review03 {
	public static void main(String[] args) {
		MyInterface03 o1 = new MyInterface03() {
			
			@Override
			public void method1() {
				System.out.println("익명클래스를 이용한 메소드 재정의");
			}
		};
	}
}

interface MyInterface03 {
	void method1();
}