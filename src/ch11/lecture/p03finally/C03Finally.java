package ch11.lecture.p03finally;

public class C03Finally {
	public static void main(String[] args) {
		try {
			boolean a = true;
			if (a) {
				return;
			}
		} finally { //return이 되어도 꼭 실행되는 코드 블럭이다
			//반드시 실행시켜야ㅐ 하는 코드가 있으면 catch블럭보다 먼저쓰거나 catch블럭 없이 쓰기도 함
			System.out.println("finally block");
		}
	}
}
