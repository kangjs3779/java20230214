package ch08.lecture.p03polymorphism;

public class C02Polymorphism {
	public static void main(String[] args) {
		method(new MyClass01());
		method(new MyClass02());
		
	}
	
	public static void method(MyInterface01 param) {
		//param의 메소드 실행 가능
		//인터페이스 타입 변수에 들어가는 클래스타입의 참조값
	}
}
