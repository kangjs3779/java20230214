package ch08.lecture.p05cast;

public class C03InstanceOf {
	public static void main(String[] args) {
		MyInterface02 o1 = new MyClass021();
		MyInterface02 o2 = new MyClass022();
		
		boolean a = o1 instanceof MyClass021;
		boolean b = o1 instanceof MyInterface02;
		//o1의 참조값의 타입이 021과 같은 타입인가??
		
		boolean c = o2 instanceof MyClass022;
		boolean d = o2 instanceof MyInterface02;
		//o2의 참조값의 차입이 022과 같은 타입인가??
		
		
	}
}
