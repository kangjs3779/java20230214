package ch16.review;

public class review01 {

	public static void main(String[] args) {
		ReviewInterface01 o1 = new ReviewClass01();
		o1.method01();
	}
}

class ReviewClass01 implements ReviewInterface01{
	@Override
	public void method01() {
		System.out.println(" concrete class 재정의");
	}
}

interface ReviewInterface01 {
	void method01();
}