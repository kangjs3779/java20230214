package ch07.lecture.p02polymorphism;

public class C01Polymorphism {
	public static void main(String[] args) {
		SubClass01 o1 = new SubClass01();
		SuperClass01 o2 = o1;
		
		o2.method01();
		//o1 o2가 실행시키는 instance는 같은 instance를 실행시키는 것이다
		
		SuperClass01 o3 = new SuperClass01();
		o3.method01();
		
	}
	
}

class SuperClass01 {
	public void method01( ) {
		System.out.println("super mehod01");
	}
}

class SubClass01 extends SuperClass01 {
	@Override
	public void method01() {
		System.out.println("subClass mehod1");
	}
}
