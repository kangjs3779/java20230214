package ch13.lecture.p01generic;

public class C06GenericMethod {
	public static void main(String[] args) {
		MyClass06 o1 = new MyClass06();
		o1.<String>method(); //이렇게 쓰는 일은 거의 없다
		//그럼 리턴타입을 어떻게 유추할 수 있는가?
		
		String s1 = o1.method();
		//안써도 변수의 타입으로 유추할 수 있기 때문에 안써도 된다
		
	}
}

class MyClass06 {
	public <T> T method() {
		return null;
	}
	//instance 뿐만 아니라 static method에서도 사용할 수 있다
}
