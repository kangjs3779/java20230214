package ch04.lecture.p01if;

public class C01If {
	public static void main(String[] args) {
		// if : 조건문(분기문)
		
		System.out.println("이전 실행문");
		if (true) {
			System.out.println("실행문1");
		}
		System.out.println("실행문2");
		
		//if 코드 블럭의 명령문이 하나면 {}는 생략이 가능함
		//하지만 생략하지 말 것 가독성이 떨어짐
		if (true) 
			System.out.println("실행문3");
			
		System.out.println("실행문4");
	}
}
