package ch06.lecture.p07constructor;

public class MyClass06 {
	//field
	String name;
	int age;
	
	//constructor
	MyClass06(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	MyClass06 () {
		System.out.println(" 파라미터 없는 기본 생성자 호출");
	}
	
	//method
}
