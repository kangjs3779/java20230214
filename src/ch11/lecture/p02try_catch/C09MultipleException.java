package ch11.lecture.p02try_catch;

public class C09MultipleException {
	public static void main(String[] args) {
		try {
			//여러 exception 발생 가능
		} catch (ArithmeticException e) {
			
		} catch ( NumberFormatException e) {
			
		} catch ( NullPointerException e) {
			
		}
		
		//여러 블럭의 하는 일이 같다면 상위타입하나로 잡아도 되고
		
		try {
			//여러 exception 발생 가능
		} catch (ArithmeticException e) {
			
		} catch ( NumberFormatException | NullPointerException e) {
			
		}
		
		//이렇게 쓸 수도 있다
		//자주보는 코드는 아니다
	}
}
