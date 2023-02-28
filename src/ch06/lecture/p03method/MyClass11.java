package ch06.lecture.p03method;

public class MyClass11 {

	void method1() {
		System.out.println("실행문1");
		System.out.println("실행문2");
		
		return; //메소드를 종료시킨다
		
//		System.out.println("실행문3 - 출력되지 않는다");
		//작성이 안됨 접근할 수 없는 명령문이라서
	}
	
	void method2() {
		System.out.println(1);
		
		if (true) {
			return;
		}
		
		System.out.println(2); //조건문이 실행되면 실행될 리가 없는 명령문
	}
}
