package ch16.sec05.exam01;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();
		//객체로 만듦
		
		person.action(Computer :: staticMethod);
		//변수를 통해 메소드 접근
		//static이라서 클래스명으로 접근
		
		Computer com = new Computer();
		
		person.action(com :: instanceMethod);
		//instance라서 변수를 통해 접근
	}
}
