package ch06.sec09;

public class Car {
	String model;
	int speed;
	
	Car(String model) {
		this.model = model;
	}
	
	void SetSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		this.SetSpeed(100);
		System.out.println(this.model + "가 달립니다.(시속 : " + this.speed + "km/h)");
	}
}
