package ch16.review;

public class review03 {
	public static void main(String[] args) {
		
		ReivewInterface03 o1 = () -> System.out.println("람다 재정의");
		o1.method03();
	}
}

interface ReivewInterface03 {
	void method03();
}
