package ch03.lecture.p02assignment;

public class C01Assignment {
	public static void main(String[] args) {
		//할당연산자 
		//대입연산자
		// = += -= *= /=
		
		int x = 10;
		
		x += 30; // x = x + 30;
		System.out.println(x);
		
		x -= 20; // x = x - 20;
		System.out.println(x);
		
		x *= 3; // x = x * 3; 할당연산자(=)는 우선순위가 꽤 낮음
		System.out.println(x);
		
		x /= 7; // x = x / 7; integer끼리의 연산이라서 소수점은 나오지 않음
		System.out.println(x);
		
		x %= 3; // x = x % 3;
		System.out.println(x);
		
		
	}
}
