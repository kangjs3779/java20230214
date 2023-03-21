package ch11.review;

public class R01 {
	public static void main(String[] args) {
		
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void method1() throws ClassNotFoundException{
		throw new ClassNotFoundException();
	
	}
}

