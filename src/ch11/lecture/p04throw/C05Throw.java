package ch11.lecture.p04throw;

public class C05Throw {
	public static void main(String[] args) {
		
	}
	
	public static void method2() throws Exception{
		throw new ClassNotFoundException();
		//throwable도 되고
		//exception도 된다
		//runtimeexception은 안된다
		
	}
	
	public static void method1() throws RuntimeException {
								//이렇게 적어도 되고 같은이름으로 적어도 된다
		throw new ClassCastException();
		//이건 runtimeexception이라서 throw를 적어도 되고 안적어도 된다
	}
}
