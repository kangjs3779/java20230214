package ch16.sec02.exam01;

public class LambdaExample {
	public static void main(String[] args) {
		Person person = new Person();
		//클래스 객체화
		
		//클래스 타입 변수를 통해 클래스 코드블럭안에 있는 메소드 접근
		//파라미터가 인터페이스 추상메소드
		//functional interface라 lambda식으로 표현
		//메소드를 재정의한 코드블럭을 보여주고 있음
		//-> : arrow연산자 화살표 연산자
		person.action(() -> {
			System.out.println("출근을 합니다");
			System.out.println("프로그래밍을 합니다");
		});
		
		//클래스 객체를 통해 메소드 접근
		//파라미터가 인터페이스
		//람다식으로 표현
		//코드명령문이 한개여서 중괄호 생략함
		person.action(() -> System.out.println("퇴근을 합니다"));
	}
}
