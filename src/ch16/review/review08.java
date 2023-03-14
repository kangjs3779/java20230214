package ch16.review;

public class review08 {
	public static void main(String[] args) {
		
		Inter08 o1 = ReviewClass08::method;
		
		o1.action(0, 5);
		
		
		Inter08 o2 = (a,b) -> ReviewClass08.method(a, b);
		
		
		o2.action(1, 2);
		//abstract method override
		//
		
		Inter08 o3 = ReviewClass08::method1;
	}
}

interface Inter08 {
	void action(int x, int y);
}
class ReviewClass08 {
	public static void method(int a, int b) {
		System.out.println(a + "이랑" + b);
		System.out.println("method 실행");
	}
	
	public static void method1(int a) {
		
	}
}