package ch12.lecture.p03math;

public class C01Math {
	public static void main(String[] args) {
		//Math Class : 수학 연산에 필요한 메소드를 가진 클래스
		//모두 static method
		
		//random
		
		//round : 반올림
		long l1 = Math.round(3.5);
		//hover하면 long타입인 것을 알 수 있다
		System.out.println(l1);
		
		long l2 = Math.round(3.14);
		System.out.println(l2);
		
		//ceil : 올림
		double d1 = Math.ceil(3.5);
		System.out.println(d1);
		
		//floor : 버림
		double d2 = Math.floor(3.14);
		System.out.println(d2);
		
		//max : 둘 중에 큰 값
		double d3 = Math.max(3.14, 3.25);
		System.out.println(d3);
		//여러가지 타입이 있음을 호버하면 알 수 있다
		
		//min : 둘 중에 작은 값
		int a = Math.min(5, 7);
		System.out.println(a);
		//여러가지 타입이 있음을 호버하면 알 수 있다
	}
}
