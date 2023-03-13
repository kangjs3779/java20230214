package ch16.lecture.p02lambda;

public class C05Lambda {
	public static void main(String[] args) {
		MyInterface05 o1 = new MyClass05();
		int r1 = o1.method(); //리턴타입을 꺼내고 싶으면
		
		MyInterface05 o2 = () -> {
			System.out.println("람다로 메소드 재정의");
			//리턴이 빠지면 안된다
			return 3;
		};
		o2.method();
		
		MyInterface05 o3 = () -> {
			return 5;
		};
		o3.method();
		
		MyInterface05 o4 = () -> 5;
		//리턴메소드는 어차피 리턴값을 받아야 한다
		//return과 중괄호 생략하고 리턴값만 써도 된다
		int r4 = o4.method();
		System.out.println(r4);
	}
}

class MyClass05 implements MyInterface05 {
	@Override
	public int method() {
		System.out.println("명령문 작성");
		
		return 0;
	}
}

interface MyInterface05 {
	int method();
	//리턴타입이 있어야 함
}