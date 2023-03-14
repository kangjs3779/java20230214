package ch16.lecture.p03reference;

public class C01MethodReference {
	public static void main(String[] args) {
		MyInterface01 o1 = a -> System.out.println(a);
		
		MyInterface01 o2 = a -> MyClass01.method(a);
		//추상메소드의 파라미터와 메소드의 파라미터가 타입과 갯수가 일치하면
		//::을 써서 생략할 수 있다
		//이게 static 메소드
		
		//method reference (static method reference)
		MyInterface01 o3 = MyClass01::method;
	}
}

interface MyInterface01 {
	void action(int a);
}

class MyClass01 {
	public static void method(int a) {
		
	}
	
}