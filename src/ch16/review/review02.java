package ch16.review;

public class review02 {
	public static void main(String[] args) {

		ReviewInterface02 o1 = new ReviewInterface02() {
			@Override
			public void method02() {
				System.out.println("익명 객체 재정의");
			}
		};
		
		o1.method02();
	}
}

interface ReviewInterface02 {
	void method02();
}
