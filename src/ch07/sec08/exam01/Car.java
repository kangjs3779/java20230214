package ch07.sec08.exam01;

public class Car {
	public Tire tire;
	//필드선언
	
	public void run() {
		tire.roll();
	}
	//roll이라는 메소드가 있다는 것이 보장되어진다
}
