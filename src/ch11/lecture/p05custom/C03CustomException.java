package ch11.lecture.p05custom;

public class C03CustomException {
	MyException1 e = new MyException1();
	MyException1 e1 = new MyException1("some message");
	//파라미터가 있는 생성자가 없으면 오류다
	
}

class MyException1 extends Exception {
	//생성자 두개 생성 필요
	public MyException1() {
		// TODO Auto-generated constructor stub
	}
	
	public MyException1(String message) {
		// TODO Auto-generated constructor stub
	}
}