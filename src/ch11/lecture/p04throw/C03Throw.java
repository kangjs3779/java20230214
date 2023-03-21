package ch11.lecture.p04throw;

public class C03Throw {
	public static void main(String[] args) {
		
		try {
			method1();
			//method1에 예외를 던진다고 했으니까
			//무조건 던지니까
			//꼭 잡아줘야 한다
			//그래서 출력된 걸 보면 최초로 어디서 던졌는지 알 수 있다
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void method1() throws ClassNotFoundException{
		throw new ClassNotFoundException();
	}
}
