package ch06.lecture.p07constructor;

public class MyClass08 {
	//field
	String name;
	int age;
	String birthDate;
	boolean married;
	
	//constructor
	MyClass08(String name, int age, boolean married) {
		this.name = name;
		this.age = age;
		this.married = married;
	}
	
	MyClass08(String name, int age, String birthDate, boolean married) {
		this.name = name;
		this.age = age;
		this.birthDate =birthDate;
		this.married = married;
	}
	
	//method
}
