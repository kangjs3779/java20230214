package ch11.lecture.p04throw;

public class C11Throw {
	public static void main(String[] args) throws ClassNotFoundException {
		method1();
		//컨트롤 + 1 로 힌트를 얻어서 잡거나 던지거나 둘 중 하나를 하면 된다
	}
	
	public static void method1() throws ClassNotFoundException {
		Class.forName(null);
		//잡거나 던지거나 둘 중 하나만 하면 된다
	}
}
