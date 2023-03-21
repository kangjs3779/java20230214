package ch11.lecture.p02try_catch;

public class C05MultipleException {
	public static void main(String[] args) {
		
		
		
		try {
			int[] a = {0,1,2};
			
			//ArithmeticException
			//ArrayIndexOutOdBoundsException
			int c = 3 / a[0];
			//두개의 예외가 발생할 수도 있다
			//그럼 catch를 두개를 사용하면 된다
			//여러 exception이 발생을 하면 여러개의 catch를 사용할 수 있다
		} catch(ArithmeticException e) {
			e.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}
