package ch03.lecture.p03comparison;

public class C01Comparison {
	public static void main(String[] args) {
		//비교연산자
		// ==. != < <= > >=
		//연산결과는 boolean type
		int x = 3;
		int y = 5;
		
		boolean z1 = x == y; //false
		boolean z2 = x !=y; //true
		
		boolean z4 = x < y; //true
		boolean z5 = x <= y;//true
		
		boolean z6 = x > y;//false
		boolean z7 = x >= y;//false
		
		//자바는 변수를 선언할 때 타입이 결정되기 때문에 자바스크립트랑은 다르게
		//타입까지 비교하는 비교연산자(===)는 없다
		
		//같은 타입끼리 비교해야함
		int a = 30;
		String b = "50";
		//자바스크립트에서는 가능했지만
		//boolean r7 = a < b;//다른 타입과 비교불가
		//boolean r8 = a < c; //장수나 실수끼리는 가능하지만 타입을 맞춘 후 비교하는 것을 권장한다
		
		int num1 = 30;
		double num2 = 30.0;
		boolean r9 = num1 == num2; //true 자동으로 int가 double타입으로 변환이 되었다
		System.out.println(r9);
		
		
	}
}
