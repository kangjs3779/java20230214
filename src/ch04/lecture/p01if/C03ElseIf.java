package ch04.lecture.p01if;

public class C03ElseIf {
	public static void main(String[] args) {
		//else if
		//위 if (else if)의 조건이 false이면 다른 조건 확인
		//여러개 있을 수 있다
		System.out.println("code 1");
		
		if (false) {
			System.out.println("code 2");
		} else if (true) {
			System.out.println("code 3");
		} else if (true) {
			System.out.println("code 4");
		}
		//else는 있어도 되고 없어도 된다..
		
		System.out.println("실행 이어감.....");
	}
}
