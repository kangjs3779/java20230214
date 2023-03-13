package ch16.lecture.p02lambda;

public class C03Lambda {
	public static void main(String[] args) {
		MyInterface03 o1 = new MyInterface03() {
			
			@Override
			public void method(int a) {
				System.out.println("익명클래스로 재정의");
				System.out.println("받은 값 : " + a);
				System.out.println();
			}
		};
		o1.method(9);
		
		MyInterface03 o2 = (int a) -> {
			System.out.println("람다로 재정의");
			System.out.println("받은 값 : " + a);
			System.out.println();
		};
		o2.method(7);
		
		
		MyInterface03 o3 = (a) -> {
			//이미 추상메소드 선언시 파라미터의 타입을 선언했기 때문에
			System.out.println("람다로 재정의하고 파라미터 타입도 생략");
			System.out.println("받은 값 : " + a);
			System.out.println();
		};
		o3.method(5);
		
		MyInterface03 o4 = a -> {
			//파라미터가 있으니까 둥근괄호 생략 가능, 파라미터가 없으면 괄호 써줘야 한다
			System.out.println("람다로 재정의하고 파라미터 타입도 생략하고 파라미터가 있으니까 둥근괄호도 생략 가능");
			System.out.println("받은 값 : " + a);
			System.out.println();
		};
		o4.method(3);
		
		MyInterface03 o5 = x -> {
			//파라미터 명을 바꿔줘도 된다
			System.out.println("파라미터 이름 변경 가능");
			System.out.println("받은 값 : " + x);
			System.out.println();
		};
		o5.method(1);
		
		MyInterface03 o6 = x -> System.out.println("받은 값: " + x);
		o6.method(0);
		//명령문이 한개라서 중괄호 생략
		
		//타입이나 괄호나 생략하는 게 좋다
	}
}

interface MyInterface03 {
	void method(int a);
}


