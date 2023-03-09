package ch13.lecture.p01generic;

public class C05GenericMethod {
	public static void main(String[] args) {
		MyClass05 o1 = new MyClass05();
		o1.<String>method("java");
		//메소드명 앞에 타입을 적어줘도 된다
		//메소드를 호출할 때 타입을 선언해주는 방법
		//클래스 전체말고 메소드에만 타입을 선언해주고 싶을 때 쓰는 방법
		o1.<Integer>method(9);
		o1.method("spring");
		o1.method(99);
		//굳이 타입안써도 된다
		
	}
}


class MyClass05 {
	
	//generic method
	public <T> void method(T t) {
		
	}
}
