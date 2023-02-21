package ch04.sec04;

public class SumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		int i; //밖에 선언하면 for문 밖에서 호출을 해도 사용할 수 있다
		
		for(i=1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}
}
