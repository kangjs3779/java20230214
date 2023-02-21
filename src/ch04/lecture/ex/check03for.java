package ch04.lecture.ex;

public class check03for {
	public static void main(String[] args) {
		
		int sum = 0;
		int a;
		for (a = 0; a <= 100; a += 3 ) {
			sum += a;
		}
		//연산을 할 때 더하고나서 할당까지 해줘야 함을 잊지말자!!
		System.out.println("총 합은 " + sum + " 입니다");
	}
}
