package ch11.lecture.p02try_catch;

public class C02TryCatch {
	public static void main(String[] args) {
		try {
			int a = 1;
			int b = 3;
			
			int c = b / a;
			
			System.out.println(1);
			//예외가 발생하지 않아서 catch코드블럭이 실행되지 않음
			//예외를 잡을게 없으니까
		} catch (ArithmeticException e){
			System.out.println(2);
		}
		
		System.out.println("continue...");
		
		//trycatch블럭은 checked exception이면 꼭 써야 한다
		//unchecked exception은 쓸 필요 없다
	}
}
