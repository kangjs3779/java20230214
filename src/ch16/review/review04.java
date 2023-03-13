package ch16.review;

public class review04 {
	public static void main(String[] args) {
		Inter01 o1 = () -> {
			System.out.println("람다 재정의");
			return 3;
		};
		
		Inter02 o2 = (x, y) -> {
			System.out.println("람다 재정의");
			return "hi";
		};
	}
}

@FunctionalInterface
interface Inter01 {
	int method1();
}

@FunctionalInterface
interface Inter02 {
	String method2(int a, String b);
}



