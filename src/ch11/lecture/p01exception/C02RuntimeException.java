package ch11.lecture.p01exception;

public class C02RuntimeException {
	public static void main(String[] args) {
		
		int a = 0;
		int b = 3;
		System.out.println("여기까지는 실행가능한 코드");
		int c = b / a;
		
		System.out.println("실행 흐름 이어감.");
	}
}
