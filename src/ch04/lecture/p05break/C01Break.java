package ch04.lecture.p05break;

public class C01Break {
	public static void main(String[] args) {
		//break
		//반복문(while for do-while) 종료
		
		while(true) {
			System.out.println("코드 반복1");
			System.out.println("코드 반복2");
			if(true) {
				break;
			}
			System.out.println("코드 반복3"); //실행되지 못하고 break를 만나 끝나버림
			System.out.println("코드 반복4");
		}
		System.out.println("다음 실행 코드들");
	}
}
