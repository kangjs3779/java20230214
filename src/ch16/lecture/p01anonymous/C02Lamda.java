package ch16.lecture.p01anonymous;

public class C02Lamda {
	public static void main(String[] args) {
		MyInterface02 o1 = () -> System.out.println("재정의한 메소드");
		//코드가 한 줄이면 중괄호도 생략가능하다
		o1.method1();
	}
}

interface MyInterface02 {
	void method1();
}
