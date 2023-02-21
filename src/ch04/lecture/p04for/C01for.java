package ch04.lecture.p04for;

public class C01for {
	public static void main(String[] args) {
		//반복문 while
		System.out.println("이전 코드 실행");
		
		int i = 0;
		while (i < 3) {
			System.out.println("반복할 코드1");
			System.out.println("반복할 코드2");
			i++;
		}
		
		System.out.println("이후 코드 실행");
		
		System.out.println("for문 사용 하기");
		
		for (int a = 0; a < 3; a++) {
			System.out.println("반복할 코드1");
			System.out.println("반복할 코드2");
		}
		
		System.out.println("실행 이어감...");
	}
}
