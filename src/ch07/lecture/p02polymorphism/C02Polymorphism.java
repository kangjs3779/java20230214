package ch07.lecture.p02polymorphism;

public class C02Polymorphism {
	public static void main(String[] args) {
		SubClass02 o1 = new SubClass02();
		o1.method1();
		o1.method2();
		
		SuperClass02 o2 = o1;
		o2.method1();
		o2.method2();
		//안되는 이유 설명
		
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