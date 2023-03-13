package ch09.review;

public class review05 {
	public static void main(String[] args) {
		MyClass05 o1 = new MyClass05();
		//생성자 호출함 -> 생성자 코드 블럭안에 로컬클래스 객체 + 변수를 통한 메소드 실행
		
		o1.method1();
		//객체 변수를 통해 메소드 실행 -> 메소드 안에 로컬클래스 객체 + 변수를 통한 메소드 실행
	}
}

class MyClass05 {
	//field
	private int a;
	
	//constructor
	MyClass05() {
		
		//local field (effectively final variable)
		int x = 9;
		
		//a는 지역변수 아님 = 값 다시 할당 가능
		a = 10;
		
		//local class(in constructor)
		class LocalClass01 {
			
			
			void localMethod01() {
				System.out.println(x);
				System.out.println(a);
			}
		}
		
		LocalClass01 l1 = new LocalClass01();
		l1.localMethod01();
	}
	
	//method
	public void method1() {
		
		//local field(effectively final variable)
		int y = 7;
		
		//a는 지역변수 아님  = 값 다시 할당 가능
		a = 20;
		
		//local class(in method)
		class LocalClass02 {
			
			void localMethod02() {
				System.out.println(y);
				System.out.println(a);
			}
		}
		
		LocalClass02 l2 = new LocalClass02();
		l2.localMethod02();
	}
}