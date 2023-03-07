package ch08.lecture.p01abstract_method;

//구현 클래스(구체클래스, concrete class)
public class MyClass01 implements MyInterface01 {
	//인터페이스를 구현했기 때문에 그 인터페이스 안에 있는 
	//추상메소드를 재정의해야 할 의무가 있다 안하면 오류임
	@Override
	public void method1() {
		System.out.println("구현된 메소드");
	}
	
	public void method2() {
		System.out.println("추가된 메소드");
	}
}
