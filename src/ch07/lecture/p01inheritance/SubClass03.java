package ch07.lecture.p01inheritance;

public class SubClass03 extends SuperClass03{
	

	//method1과 method2를 상속받았음
	
	//method2 재정의(상속받은 메소드는 재정의 가능)
	//override = 재정의
	public void method2() {
		System.out.println("재정의한 메소드2");
	}
	
	public void method3() {
		System.out.println("슈퍼클래스 메소드3");
	}
}
