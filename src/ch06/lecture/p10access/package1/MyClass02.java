package ch06.lecture.p10access.package1;

public class MyClass02 {
	public String name;
	private int age;
	//default 접근 제한자(package private 접근 제한자)
	boolean married;
	
	public void method1() {
		System.out.println("public method");
	}
	
	private void method2() {
		System.out.println("private method");
	}
	
	//default 접근 제한자(package private 접근 제한자)
	void method3() {
		System.out.println("default method");
	}
}
