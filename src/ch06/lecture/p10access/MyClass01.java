package ch06.lecture.p10access;

public class MyClass01 {
	//접근제한자(access modifier)
	//public : 어디서든지 접근 가능
	//private : 작성한 클래스 내에서만 접근 가능
	
	//field
	public String name;
	private int age;
	
	//method
	public void method1() {
		System.out.println("method1");
	}
	
	private void method2() {
		System.out.println("method2");
	}
	
	private void method3() {
		System.out.println(age);
		//내부에서는 접근 가능
	}
	
	private void method4() {
		method2();
	}
	
}
