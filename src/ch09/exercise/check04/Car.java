package ch09.exercise.check04;

public class Car {
	class Tire {}
	static class Engine {}
}

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		Car.Tire tire = new Car.Tire();
		Car.Engine engine = new Car.Engine();
	}
}
