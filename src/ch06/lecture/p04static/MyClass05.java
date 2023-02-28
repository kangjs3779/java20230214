package ch06.lecture.p04static;

public class MyClass05 {
	//instance field
	String name;
	
	//static field
	static String model;
	
	// instance method
	void printName() {
		System.out.println(name);
		System.out.println(model);
		//instance는 static에 접근가능
	}
	
	//static method
	static void printModel() {
		System.out.println(model);
		System.out.println(name);
		//static에서 instance접근은 안된다
		//차가 여러대라서 접근하기 힘들어
	}
	
	
}
