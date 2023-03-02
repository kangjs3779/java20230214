package ch06.lecture.p07constructor;

public class MyClass10 {
	String name;
	int age;
	String birth;
	boolean married;
	
	MyClass10(String name) {
		this.name = name;
	}
	
	MyClass10(String name, int age) {
		this(name);
		//파라미터의 타입과 개수 순서를 보고 해당되는 생성자를 호출한다 
//		this.name = name;
		this.age = age;
	}
	
	MyClass10(String name, int age, String birth) {
		this(name, age); //다른 생성자 호출
//		this.name = name;
//		this.age = age;
		//두개는 안적어도 된다
		this.birth = birth;
	}
	
	void printField() {
		System.out.println("name: " + name + ", age: "+ age + ", birth: " + birth);
	}
}
