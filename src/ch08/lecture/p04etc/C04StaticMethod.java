package ch08.lecture.p04etc;

public class C04StaticMethod {
	public static void main(String[] args) {
		MyInterface04.method1();
		//static이라서 객체화 하지 않고 바로 메소드 실행 가능
		//근데 인터페이스는 애초에 인스턴스 생성이 안됨
	}
}
