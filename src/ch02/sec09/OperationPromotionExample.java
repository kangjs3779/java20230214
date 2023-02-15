package ch02.sec09;

public class OperationPromotionExample {
	public static void main(String[] args) {
		byte result1 = 10 + 20; //리터럴끼리의 합은 해당 변수 타입에 그대로 출력 가능
		System.out.println("result1: " + result1);
		
		byte v1 = 10;
		byte v2 = 20;
		int result2 = v1 + v2; //변수끼리의 합은 int로 전환되어 출력
		System.out.println("result2: " + result2);
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long result3 = v3 + v4 + v5; //long이 포함되어 있는 변수끼리의 연산은 최종값의 타입은 long
		System.out.println("result3: " + result3);
		//서로 다른 연산을 하면 우선 순위가 있다
		//v3과 v4의 연산으로 최종값의 타입은 int
		//int와 v5의 연산의 최종값의 타입은 long이 포함되어 있으니까 최종적으로 long이 된다
		
		char v6 = 'A';
		char v7 = 1;
		int result4 = v6 + v7; //byte char short int의 연산의 결과값의 타입은 int
		System.out.println("result4: " + result4);
		System.out.println("result4: " + (char)result4);
		//유니코드로 전환이 되어 연산이 된다
		//연산자의 우선 순위 정리
		//java operator precedence 라고 구글링 ㄱㄱ
		//casting의 우선순위가 +보다 높아서 먼저 변환이 된다
		
		
		int v8 = 10;
		int result5 = v8 / 4;
		System.out.println("result5: " + result5);
		//int끼리의 연산은 정수타입이므로 2.5가 아니라 2가 나온다
		
		int v9 = 10;
		double result6 = v9 / 4.0; //정수와 실수의 연산은 실
		System.out.println("result6: " + result6);
		//4.0은 double이다

		int v10 = 1;
		int v11 = 2;
		double result7 = (double) v10 / v11;
		System.out.println("result7: " + result7);
		//()의 우선순위가 더 높기때문에 v10은 double타입이 되었다
		//그리고 double v10과 int v11이 연산되었으므로 최종적인 값의 타입은 double타입이 된다.
		
	}
}
