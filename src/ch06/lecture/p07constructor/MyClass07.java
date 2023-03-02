package ch06.lecture.p07constructor;

public class MyClass07 {
	//field
	String name;
	int age;
	
	//constructor
	//constructor overloading
	//파라미터 순서 타입 개수에 따라 생성자 여러개 만들 수 있음
	
	MyClass07() {
		//기본 생성자 만들 수 있음
	}
	
	MyClass07(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//method
}
