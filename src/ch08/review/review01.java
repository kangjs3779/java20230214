package ch08.review;

public class review01 {
	public static void main(String[] args) {
		
		Train.hand2();
		Train.stop2();
		
//		Dog dog = new Dog();
//		Cat cat = new Cat();
//		
//		dog.hand1();
//		dog.stop1();
//		
//		cat.hand1();
//		cat.stop1();
		

	}
}

class Dog implements Train{}

class Cat implements Train{}

interface Train {	
	//instance method
	public default void hand1() {
		System.out.println("손을 내민다");
		common1();
	}
	
	public default void stop1() {
		System.out.println("기다린다");
		common1();
	}

	private void common1() {
		System.out.println("간식을 먹는다");
	}
	
	//public static method
	
	public static void hand2() {
		System.out.println("손 훈련시키는 방법");
		common2();
	}
	public static void stop2() {
		System.out.println("기다려 훈련시키는 방법");
		common2();
	}

	private static void common2() {
		System.out.println("훈련반복하기");
	}
}
