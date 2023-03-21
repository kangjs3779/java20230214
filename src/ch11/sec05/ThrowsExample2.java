package ch11.sec05;

public class ThrowsExample2 {
	public static void main(String[] args) throws Exception{
		findClass();
		//다시던짐
	}
	
	public static void findClass() throws ClassNotFoundException {
		//다시던짐
		Class.forName("java.lang.String2");
		//API를 확인해보면 class not~~를 던졌음
	}
}
