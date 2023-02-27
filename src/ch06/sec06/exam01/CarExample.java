package ch06.sec06.exam01;

public class CarExample {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		System.out.println("모델명: " + myCar.model);
		System.out.println("시동여부: " + myCar.start);
		System.out.println("현재속도: " + myCar.speed);
		
		Car yourCar = new Car();
		
		System.out.println("모델명: " + yourCar.model);
		System.out.println("시동여부: " + yourCar.start);
		System.out.println("현재속도: " + yourCar.speed);
		
		myCar.speed = 100;
		System.out.println(myCar.speed);
		System.out.println(yourCar.speed);
		//새로운 참조값 = 새로운 저장공간을 만들어서 저장한 것이라서  영향을 받진 않음
		
		Car hisCar = yourCar; //참조값을 복사했기때문에
		yourCar.speed = 50;
		System.out.println(yourCar.speed);
		System.out.println(hisCar.speed);
		//값을 바꾸면 영향을 받음
		
		//참조값을 확인하고 싶다면
		System.out.println(System.identityHashCode(myCar));
		System.out.println(System.identityHashCode(yourCar));
		System.out.println(System.identityHashCode(hisCar));
		
		
	}
}
