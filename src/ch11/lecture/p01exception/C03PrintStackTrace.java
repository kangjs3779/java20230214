package ch11.lecture.p01exception;

public class C03PrintStackTrace {
	public static void main(String[] args) {
		try {
			int a = 0;
			int b = 3;
			
			int c = b/ a;
			
			System.out.println("try block continue");
		} catch (ArithmeticException e) {
			//catch block
			//예외가 발생했다는 흔적을 남겨줘야 한다
			
//			System.out.println("예외 발생!!!!!");
			
			e.printStackTrace();
			//예외가 발생했을 때 출력되는 빨간 글씨를 출력해주는 메소드이다
			//보통은 예외가 발생하면 흔적을 남겨야지 안그러면 문제를 고치기가 힘들기 때문이다
			//별일 없으면 이걸 쓰면된다
		}
		
		System.out.println("program continue");
	}
}
