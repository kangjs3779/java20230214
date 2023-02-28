package ch06.lecture.p04static;

public class MyClass02 {
	//static field(variable)(class field(variable))
	static String name;
	static int age;
	//instance없이 클래스를 통해서 사용한다
	
	//static method(class method)
	static void greeting() {
		System.out.println(age + "세" + name + "입니다.");
	}
}
