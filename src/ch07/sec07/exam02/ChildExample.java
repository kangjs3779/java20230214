package ch07.sec07.exam02;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		
		parent.method1();
		parent.method2();
//		parent.method3(); 호출불가
		//호출결과를 보면 실제 인스턴스를 가지고 있는 메소드가 실행 되는 것이다
		//child에서 method2를 오버라이드 했고 그것에 대한 참조값을 parent가
		//복사했으니까 재정의된 method2가 실행되는 것이다
	}
}
