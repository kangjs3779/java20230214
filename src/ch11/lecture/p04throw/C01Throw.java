package ch11.lecture.p04throw;

public class C01Throw {
											//던지는 객체 타입 명시
	public static void main(String[] args) throws Throwable {
		//예외를 던지는 코드
		//Throwable 타입의 객체를 던질 수 있음
		Throwable a = new Exception();
				
		throw a; //객체를 던지는 코드
		//객체를 던졌다는 표시를 해줘야 한다
		//throws Throwable
		
	}
}
