package ch07.lecture.p01inheritance;

public class SubClass04 extends SuperClass04 {
	
	//superclass04 method1 재정의
	//재정의 메소드인지 컴파일러가 검증
	@Override //제정의 할 때는 항상 붙여주기
	public void method1() {
		System.out.println("sub method1");
	}
	
	@Override
	public void method2() {
		System.out.println("sub method2");
	}
	
	//그냥 여백에 컨트롤 스페이스 누르면 된다
}
