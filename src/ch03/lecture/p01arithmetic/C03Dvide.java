package ch03.lecture.p01arithmetic;

public class C03Dvide {
	public static void main(String[] args) {
		// 정수는 0으로 나눌 수 없음
		int a = 0;
		int b = 3;
		
		int c = b / a; //exception(예외)이 나오면 프로그램 종료
		
		System.out.println(c);
		System.out.println("프로그램 실행 흐름.....");
		
	}
}
