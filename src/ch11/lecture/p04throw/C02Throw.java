package ch11.lecture.p04throw;

public class C02Throw {
	public static void main(String[] args) {
		
		//exception을 던졌으니 잡는 애가 필요함
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void method1() throws Exception{
//		Throwable a = new Exception();
//		throw a;
		//이걸 줄여서 밑에 한줄로 작성
		
		throw new Exception();
	}
}
