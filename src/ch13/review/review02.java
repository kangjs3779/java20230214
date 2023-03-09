package ch13.review;

public class review02 {
	public static void main(String[] args) {
		Class02 o1 = new Class02();
		o1.method1("String type");
		
		o1.method1(55);
		
		
		o1.method2(3);
		o1.method2("집!!!");
		o1.method2(3.14);
		
		
		Class02.method4("static메소드도 가능");
		
		String s1 = o1.method5();
		System.out.println(s1);
	}
}

class Class02 {
	public <T> T method1(T t) {
		System.out.println(t);
		return t;
	}
	
	public <T> void method2(T t) {
		System.out.println(t);
	}
	
	public void method3(int a) {
		
	}
	
	public <T> T method5() {
		return null;
	}
	
	public static <T> void method4(T t) {
		System.out.println(t);
	}
}