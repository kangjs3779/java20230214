package ch16.sec02.exam01;

public class Person {
	public void action(Workable workable) {
		workable.work();
	}
}


//파라미터는 인터페이스타입의 변수
//코드블럭에서는 인터페이스변수를 통해 추상메소드 접근