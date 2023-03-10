package ch09.lecture.p02anonymous;

public class C06Anonymous {
	public static void main(String[] args) {
		class Sub06 extends MyClass06 {
			@Override
			void myMethod1() {
				System.out.println("로컬클래스 재정의1");
			}
		}
		
		MyClass06 o1 = new Sub06();
		myMethod1(o1);
		
		
		MyClass06 o2 = new MyClass06() {
			
			@Override
			void myMethod1() {
				System.out.println("로컬클래스 재저의2(익명클래스)");
			}
		};
		myMethod1(o2);
	}
	
	public void method1(MyClass06 param) {
		param.myMethod1();
	}
}

//코드 이상함 확인 할 것

abstract class MyClass06 {
	abstract void myMethod1();
}