package ch08.lecture.p05cast;

public class C02InstanceOf {
	public static void main(String[] args) {
		MyInterface02 o1 = new MyClass021();
		MyInterface02 o2 = new MyClass022();
		
//		MyClass021 o3 = (MyClass021) o1;
//		MyClass022 o4 = (MyClass022) o2;
//		
//		MyClass022 o5 = (MyClass022) o1; //안된다
		//o1에는 021의 참조값이 들어있는데 이걸 022로 넣을 수는 없다
		System.out.println("실행 이름 이어감");
		
		//안전하게 쓰기 위해서 위에는 프로그램 종료
		if (o1 instanceof MyClass021) {
			MyClass021 o3 = (MyClass021) o1; // ok
		}
		
		if (o1 instanceof MyClass021 o3) {
			
		}
		
		if (o2 instanceof MyClass022) {
			MyClass022 o4 = (MyClass022) o2; // ok
		}
		
		if (o2 instanceof MyClass022 o4) {
			
		}
		
		if (o1 instanceof MyClass022) {
			MyClass022 o5 = (MyClass022) o1; // x
		}
		
		if (o1 instanceof MyClass022 o5) {
			
		}
		
		System.out.println("실행 흐름 이어감");
	}
}
