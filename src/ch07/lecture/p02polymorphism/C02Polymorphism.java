package ch07.lecture.p02polymorphism;

public class C02Polymorphism {
	public static void main(String[] args) {
		SubClass02 o1 = new SubClass02();
		//o1안에는 자식클래스의 인스턴스 참조값이 들어감
		o1.method1();
		//자식은 부모의 것을 마음대로 쓸 수 있으니 부모클래스의 메소드 사용가능
		o1.method2();
		//본인 것도 마음대로 사용 가능
		
		SuperClass02 o2 = o1;
		//부모클래스타입안에 자식클래스의 인스턴스 참조값이 들어감
		
		o2.method1();
		//타입
		o2.method2();
		//안전하게 컴파일하기 위해서
		
		
		SuperClass02 o3 = new SuperClass02();
		o3.method1();
		o3.method2();
		o3.method3();
	}
}


class SuperClass02 {
	public void method1() {
		System.out.println("super method1");
	}
}

class SubClass02 extends SuperClass02{
	public void method2() {
		System.out.println("sub mehod2");
		//sub는 메소드를 두개가지고 있는 것과 같음
	}
}

class SubClass022 extends SuperClass02 {
	public void method3() {
		System.out.println("sub method3");
	}
}