package ch16.lecture.p02lambda;

public class C04Lambda {
	public static void main(String[] args) {
		MyInterface04 o1 = new MyInterface04() {
			
			@Override
			public void method(int x, int y) {
				System.out.println("익명클래스");
				System.out.println(x + ", " + y);
				System.out.println();
			}
		};
		o1.method(10, 20);
		
		MyInterface04 o2 = (int x, int y) -> {
			System.out.println("람다");
			System.out.println(x + ", " + y);
			System.out.println();
		};
		o2.method(30, 40);
		
		MyInterface04 o3 = (a, b) -> {
			System.out.println("타입생략");
			System.out.println(a + ", " + b);
			System.out.println();
		};
		o3.method(80, 90);
		
		//파라미터 한개일 때만 ()생략 가능
		//두개 이상이거나 0개이면 ()를 써야 한다
	}
}


@FunctionalInterface
interface MyInterface04 {
	void method(int x, int y);
}