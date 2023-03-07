package ch08.lecture.p03polymorphism;

public interface C06Polymorphism {
	public static void main(String[] args) {
		MyInterface06 o1 = method();
		//변수타입은 이거거나 상위타입이면 된다
	}
	
	public static MyInterface06 method() {
//		return new MyClass06();
		return new MyClass07();
		//하위클래스를 리턴값으로 출력할 수있다
	}
}

interface MyInterface06 {}

class MyClass06 implements MyInterface06 {}
class MyClass07 implements MyInterface06 {}

