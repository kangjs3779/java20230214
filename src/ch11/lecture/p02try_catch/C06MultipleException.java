package ch11.lecture.p02try_catch;

public class C06MultipleException {
	public static void main(String[] args) {
		try {
			int[] a = {0, 1};
			int c = 3 / a[0];
			
			//ArithmeticException - 이 클래스는 RuntimeException이라고 할 수 있다 상속받고 있기 때문에
			//ArrayIndexOutOfBoundsException - 이클래스는 RuntimeException이라고 할 수 있다 상속받고 있기 때문에
		} catch (RuntimeException e) {
			e.printStackTrace();
			//API를 보면서 상속클래스의 관계를 보면서 이해해볼 것
		}
		
	}
}
