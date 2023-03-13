package ch09.lecture.p02anonymous;

import ch08.lecture.p01abstract_method.*;

public class C07Anonymous {
	public static void main(String[] args) {
		MyInterface07 o1 = new MyClass07();
		//오른쪽부터 해석
		//구현관계는 상속관계와 비슷하니까
		//자식은 부모이다 가능
		//클래스는 인터페이스다 가능
		o1.method1();
	}
}

class MyClass07 implements MyInterface07 {
	@Override
	public void method1() {
		System.out.println("재정의된 메소드");
	}
}

interface MyInterface07 {
	void method1();
	
}
