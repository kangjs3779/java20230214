package ch16.lecture.p03reference;

public class C06ConstructorReference {
	//생성자 참조
	//reference to a constructor
	
	public static void main(String[] args) {
		MyInterface07 o1 = () -> {return new MyClass07();};
		MyInterface07 o2 = () -> new MyClass07();
		MyInterface07 o3 = MyClass07::new;//생성자 참조
		//파라미터가 일치하면
		
		MyInterface08 o4 = (a) -> new MyClass07(a);
		MyInterface08 o5 = MyClass07::new;
	}
}

interface MyInterface08 {
	MyClass07 action(int a);
}

interface MyInterface07 {
	MyClass07 action();
}

class MyClass07 {
	MyClass07 () {
		//기본생성자
	}
	
	MyClass07(int a) {
		//파라미터 있는 생성자
	}
}
