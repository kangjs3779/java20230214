package ch03.sec02;

public class ArithmeticOperatorExample {
	public static void main(String[] args) {
		byte v1 = 10;
		byte v2 = 4;
		int v3 = 5;
		long v4 = 20L;
		
		int result1 = v1 + v2; //byte short char int의 변수 연산의 결과값 타입은 int
		System.out.println("result1: " + result1);
		
		long result2 = v1 + v2 - v4; //long이 포함되어 있으면 결과값 타입은 long
		System.out.println("result2: " + result2);
		
		double result3 = (double) v1 / v2; //결과값이 int인데 실수인 double로 강제 변환
		System.out.println("result3: " + result3);
		//((double) v1) / v2 괄호가 우선 순위라서 이런 순서로 실행된다
		
		int result4 = v1 % v2; //결과값의 타입은 int라서 변수 타입이 int임
		System.out.println("result4: " + result4);
	}
}
