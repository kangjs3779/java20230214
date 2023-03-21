package ch11.review;

public class R03 {
	public static void main(String[] args) {
		MyException02 e = new MyException02("쨔냐쟈ㅑ나냐쟌");
		
		throw e;
	}
}

class MyException01 extends Exception {
	//checked exception
	
	//예외가 발생할 때 내가 원하는 메세지를 주고 싶다면 생성자를 새로 정의하면 된다
	public MyException01(String message) {
		super(message);
	}
}

class MyException02 extends RuntimeException {
	//unchaecked exception
	
	public MyException02(String message) {
		super(message);
	}
}
