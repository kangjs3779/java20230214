package ch02.lecture.p02type;

public class C08Double {
	public static void main(String[] args) {
		//실수
		//float(4 bytes), double(8 bytes)
		
		int il = 3;
		//il = 3.14; 변수타입이 int이라서 실수는 안된다
		
		double d1 = 3.14;
		d1 = 99.9999;
		d1 = 3;
		//정수도 할당 가능
		
		float f1 = 3.14F;//대소문자 모두 가능함
		//사용시 주의
		//10 진접을 2진법으로 바꿔서 저장
		double d2 = 0.1;
		double d3 = 0.2;
		
		double d4 = d2 + d3;
		System.out.println(d4);
		//연산결과가 좀 다를 수 있다
		//실수를 저장할 때에는 double 타입을 사용
	}
}
