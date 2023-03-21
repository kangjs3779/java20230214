package ch11.lecture.p01exception;

public class C04PrintStackTrace {
	public static void main(String[] args) {
		//unchecked exception
		
		try {
			String a = "java";
			System.out.println(a.charAt(4)); //unchecked exception
			//컴파일가 체크를 하지 않으니까 trycatch블럭을 사용할 수 있다			
		} catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
//		Class.forName("java.lang.String");
		//컨트롤 + 1
		//surroundWith tryCatch
		//아래처럼 바로 된다

		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
