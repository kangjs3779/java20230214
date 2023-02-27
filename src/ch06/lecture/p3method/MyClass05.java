package ch06.lecture.p3method;

public class MyClass05 {
	//실행코드
	void method1() {
		System.out.println("파라미터 없는 메소드");
	}
	
	void method2(int x, int y) {
		System.out.println(x + " + " + y + " = " + (x + y));
	}
	
	//별로 삼각형 찍기
	void method3(int line) {
		for(int i = 0; i < line; i++) {
			for(int j = 0; j <= i; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//파라미터도 변수의 일종이다
	//파라미터값을 변경하고 싶다면 새로운 변수를 설정해서 변경하는 것이 좋다
	//파라미터 자제 값을 변경하는 것은 좋은 습관이 아니다
	//int b = param; b=5;
	void method4(int param) {
		int var;
		var = 3;
		
		System.out.println(param * var);
	}
}
