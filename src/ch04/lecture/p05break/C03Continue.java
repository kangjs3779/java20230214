package ch04.lecture.p05break;

public class C03Continue {
	public static void main(String[] args) {
		while(true) {
			System.out.println("실행문1");
			
			if (false) {
				continue;
			} //이렇게 조건문 안에 continue를 써줘야 컴파일을 할 수 있다
			System.out.println("실행문2"); //도달할 수 없는 코드 continue만 쓰면
		}
	}
}
