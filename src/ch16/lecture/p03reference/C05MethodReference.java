package ch16.lecture.p03reference;

public class C05MethodReference {
	public static void main(String[] args) {
		MyInterface06 o1 = (x) -> x.someMethod();
		//x는 클래스를 객체로 만드는 것,,
		//그래서 x를 통해 클래스 안에 있는 메소드에 접근
		
		
		MyInterface06 o2 = MyClass06::someMethod;
		//참조하는 객체의 타입::접근하는 메소드
	}
}

@FunctionalInterface
interface MyInterface06 {
	void action(MyClass06 o);
}

class MyClass06 {
	void someMethod() {
		
	}
}