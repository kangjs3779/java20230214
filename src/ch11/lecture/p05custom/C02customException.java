package ch11.lecture.p05custom;

public class C02customException {
	public static void main(String[] args) throws Exception {
		Exception e = new Exception();
		//기본생성자로 만듦
		Exception e2 = new Exception("some message");
		//파라미터생성자로 만듦
		
		System.out.println(e.getMessage());
		System.out.println(e2.getMessage());
		
//		throw e;
		//기본생성자로 던지면 아무런 메세지도 나오지 않음
		throw e2; 
		//메세지가 표시됨
		
	}
}
