package ch15.review;

public class review11 {
	public static void main(String[] args) {
		
		//lambda
		A o3 = (a) -> {System.out.println("람다 실행");};
		A o4 = a -> System.out.println("람다 더 간결");
		o3.run(1);
		o4.run(2);
		
		//메소드 참조 : 클래스에 있는 메소드를 참조
		B b = new B();
		b.method2(x -> System.out.println("파라미터가 인터페이스"));
		
		//익명개체
		A o1 = new A() {
			@Override
			public void run(int a) {
				System.out.println("익명개체 실행");
			}
		};
		o1.run(1);
		
		//고전 클래스 구현
		A o2 = new B();
		o2.run(1);
		
		
	}
}

@FunctionalInterface
interface A {
	void run(int a);
}

class B implements A{
	@Override
	public void run(int a) {
		System.out.println("클래스통해 실행");
	}
	
	public static void method2(A a) {
		System.out.println("메소드2 실행");
	}
}

