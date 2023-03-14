package ch16.review;

public class review09 {
	public static void main(String[] args) {
		
		ReviewClass09 o1 = new ReviewClass09();
		
		Inter09 o2 = o1::method;
	}
}

interface Inter09 {
	void action(int a);
}

class ReviewClass09 {
	public void method(int a) {
		System.out.println("method");
	}
}