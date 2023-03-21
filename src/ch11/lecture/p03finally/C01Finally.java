package ch11.lecture.p03finally;

public class C01Finally {
	public static void main(String[] args) {
		try {
			int a = 0;
			int c = 3 / a;
			
			System.out.println("try block continue...");
		} catch (ArithmeticException e) {
			System.out.println("exception!!!");
			//9번과 11번 라인의 실행코드는 동시에 실행할 수 없다
		} finally {
			//exception발생 유무와 상관없이 항상 실행
			System.out.println("finally block !!!!!!!");
			// exception 발생 하면 catch블럭에서 finally블럭으로 넘어와서 실행을 시키고 나간다
			//try 블럭 실행하고 finally블럭으로 넘어와서 실행을 시키고 나간다
		}
		
		System.out.println("continue...");
	}
}
