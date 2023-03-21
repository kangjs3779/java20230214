package ch11.lecture.p03finally;

public class C02Finally {
	public static void main(String[] args) {
		try {
			boolean a = true;
			
			if (a) {
				return;
			}
			System.out.println("try block...");
		} catch (NullPointerException e) {
			System.out.println("exception block...");
		} finally {
			//try블럭에 return이 있어서 종료가 되어도 실행되는 블럭이다
			//예외 유부 뿐만 아니라
			System.out.println("finally block");
		}
		
		System.out.println("continue...");
		//return이 되어서 종료가 되었기 때문에 이건 실행이 안된다
		
	}
}
