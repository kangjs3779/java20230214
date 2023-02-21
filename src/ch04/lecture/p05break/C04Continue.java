package ch04.lecture.p05break;

public class C04Continue {
	public static void main(String[] args) {
		
		for(int i = 0; i < 500; i++) {
			System.out.println("실행코드1");
			
			if (false) {
				continue;
			} //이렇게 조건문 안에 넣어 줘야함
			System.out.println("실행코드2"); //그냥 continue만 쓰면 도달할 수 없는 코드로 컴파일이 안된다
		}
	}
}
