package ch16.review;

public class review10 {
	public static void main(String[] args) {
		Inter10 o1 = (a) -> {return new ReviewClass10(a);};
		o1.action("hi");
		
		Inter10 o2 = x -> new ReviewClass10(x);
		o2.action("hi");
		
		Inter10 o3 = ReviewClass10::new;
		o2.action("hi");
		
		
	}
}

@FunctionalInterface
interface Inter10 {
	ReviewClass10 action(String a);
}

class ReviewClass10 {
	ReviewClass10(String a) {
		System.out.println("생성자 실행");
	}
}