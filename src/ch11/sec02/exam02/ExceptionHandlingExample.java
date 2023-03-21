package ch11.sec02.exam02;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String"); //클래스라는 타입의 값을 리턴해준다 스트링이라는 클래스가 있으면
			//java.lang.String이라는 클래스가 있으면 클래스타입의 값을 리턴해주는 것이라고 생각하면 된다
			//없으면 예외를 발생시킨다
			//근데 있으니까 실행이 된 것이다
			//예외가 없으니까 catch할 필요가 없어서 넘어감
			System.out.println("java.lang.String 클래스가 존재합니다");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		try {
			Class.forName("java.lang.String2");
			//java.lang.String2라는 클래스는 없음
			//없으면 예외를 발생시킨다
			//예외 발생
			//다음 실행코드는 진행되지 않는다
			//하지만 프로그램은 종료되지 않고 catch블럭으로 넘어간다
			System.out.println("java.lang.String2 클래스가 존재합니다");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
			//예외를 잡아서 여기블럭안에 있는 실행코드는 실행이 된다
			System.out.println("java.lang.String2 클래스가 존재하지 않습니다");
		}
		
		System.out.println("continue");
	}
}
