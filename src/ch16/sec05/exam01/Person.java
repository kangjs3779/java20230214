package ch16.sec05.exam01;

public class Person {
	public void action(Calcuable clacuable) {
		double result = clacuable.calc(10, 4);
		System.out.println("결과 : " + result);
	}
}
//인터페이스 값을 파라미터로 받음\
//리턴값을 result실수타입 변수에 넣음