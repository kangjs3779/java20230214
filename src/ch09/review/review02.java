package ch09.review;

public class review02 {
	public static void main(String[] args) {
		
		MyInterface02 o1 = new MyClass02();
		
		o1.method1();
		
		
		MyInterface02 o2 = new MyInterface02() {
			
			@Override
			public void method1() {
				System.out.println("anonymous로 메소드 재정의");
			}
		};
		
	}
	
}

class MyClass02 implements MyInterface02{
	
	@Override
	public void method1() {
		System.out.println("interface안에 있는 method override");
	}
}

interface MyInterface02 {
	
	void method1();
	
}
