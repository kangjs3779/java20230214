package ch08.lecture.p04etc;

public class MyInterface02 {
	//인터페이스에서 접근제한자를 안쓰면 모두 public이다
	//인터페이스의 값 기능을 추가할 수 있음 static field, static method
	
	private void common() {
		System.out.println("공통된 코드들.");
		//공통된 코드들이 중복되니까 따로 뺄 수 이도록 하려고 함
	}
	
	default void method1() {
		common();
		System.out.println("메소드1 코드들.");
	}
	
	default void method2() {
		common();
		System.out.println("메소드2 코드들.");
	}
}
