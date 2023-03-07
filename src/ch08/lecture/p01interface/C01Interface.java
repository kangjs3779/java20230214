package ch08.lecture.p01interface;

public class C01Interface {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();
		MyInerface01 o2 = o1;
		MyInterface02 o3 = o1;
		//하지만 거꾸로는 안된다
		
		MyClass01 o4 = o2; //안된다
		
		//인터페이스는 인스턴스를 만들 수 없다 그냥 개념일 뿐이다
	}
}
