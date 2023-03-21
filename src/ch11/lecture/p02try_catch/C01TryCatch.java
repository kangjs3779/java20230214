package ch11.lecture.p02try_catch;

public class C01TryCatch {
	public static void main(String[] args) {
		//프로그램을 종료시키지 않고 끝까지 실행시키도록 하는 것
		
		int a = 0;
		int b = 3;
		
		//try를 만나면 아 예외가 발생할 수도 있겠다라고 생각하고 주의해서 실행함
		try { //exception 발생할 수 있는 코드 작성
			//앞뒤 코드가 다 들어가도 된다 int a, b같은거
			int c = b / a;	
			//예외가 발생한 순간 예외를 잡기 위해서 catch로 바로 넘어 간다
			//예외가 발생한 다음에는 실행코드가 실행되지 않는다
			//잡고나서 실행이 된다고 생각하면 된다
			
			
			
			
			
			
			
			
			
			
			
			
			System.out.println(1);
		} catch (ArithmeticException e) { //try와 짝꿍 블럭
			//발생한 exception을 잡아서 실행하는 코드 작성
			//예외 클래스 객체를 만들어서 참조값을 던져줄 변수를 만들어줌 e
//			e.printStackTrace();
			System.out.println(2);
			
		}
		
		System.out.println("continue...."); //도달하지 못함 예외발생해서
	}
}
