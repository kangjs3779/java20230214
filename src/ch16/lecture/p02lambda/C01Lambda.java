package ch16.lecture.p02lambda;

public class C01Lambda {
	public static void main(String[] args) {
		//functional interface로 lambda식 만들 수 있음
		MyInterface01 o1 = () -> System.out.println("재정의 메소드");
		o1.method1();
		MyInterface01 o2 = () -> System.out.println("또다른 메소드");
		o2.method1();
	}
}

//추상 메소드가 하나인 interface의 익명클래스 객체 만드는 코드
//추상 메소드가 두개 이상이면 안된다

//추상 메소드가 하나인 interface = functional interface

@FunctionalInterface //추상메소드가 두개이면 오류남
//써도되고 안써도 된다
interface MyInterface01 {
	void method1();
	//추상 메소드 하나만 있으면 functional interface
	
	String toString();
	//Object에 있는 메소드는 추상메소드 수에 포함되지 않는다
	//오브젝트는 모든 클래스의 상위클래스라서 메소드를 재정의하는 것이나 마찬가지라서 추상메소드가 아니다
	
//	void method2();
	//추상 메소드 두개니까 functional interface 아님
	
	default void method3() {
		
	}
	
	static void method4() {
		
	}
	
	//이런 메소드들이 있어도 추상메소드가 하나만 있으면 functional interface이다
}