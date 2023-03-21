package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
	public static void printLength(String data) {
		int result = data.length();
		System.out.println("문자 수: " + result);
	}
	
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n"); //실행됨
		printLength("thisIsJava"); //data에 string넣어줌
		printLength(null); //null을 넣어줌
		System.out.println("[프로그램종료]");
		
	}
	
	
}
