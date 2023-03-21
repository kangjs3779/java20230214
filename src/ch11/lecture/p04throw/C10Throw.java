package ch11.lecture.p04throw;

public class C10Throw {
	public static void main(String[] args) throws ClassNotFoundException{
		method2();
		//잡거나 던지거나 함
	}
	
	public static void method2() throws ClassNotFoundException{
		method1();					//던짐
		//그럼 잡거나 던지거나
		//근데 다시 던짐
	}
								//예외를 던졌음
	public static void method1() throws ClassNotFoundException {
		//unchacked예외를 썼으면 method2에서 아무것도 안적어도된다
		//checked예외르 썼으면 method1에서 뭘 적어야 한다
	}
	
}
