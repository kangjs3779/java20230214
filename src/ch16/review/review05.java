package ch16.review;

public class review05 {
	public static void main(String[] args) {
		Inter05 o1 = a -> System.out.println(a);
		//함수형 인터페이스 람다식 재정의
		
		Inter05 o2 = a -> Cla05.method2(a) {
			
		};
		
	}
}

@FunctionalInterface
interface Inter05 {
	void method1(int a);
}

class Cla05 {
	public static void method2(int a) {
		System.out.println("실행 중");
	}
}