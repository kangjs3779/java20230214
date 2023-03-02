package ch06.lecture.p07constructor;

public class C06Constructor {
	public static void main(String[] args) {
		MyClass06 o1 = new MyClass06("son", 77);
		MyClass06 o2 = new MyClass06(); 
		//생성자를 파라미터가 있는 걸로 만들었기 때문에 사용할 수 없다
		//기본 생성자를 호출 못함
		//기본 생성자를 따로 만들면 가능
		
		
	}
}
