package ch09.lecture.p02anonymous;

public class C01Anonymous {
	public static void main(String[] args) {
		SubClass01 o1 = new SubClass01();
		MyClass01 o2 = new SubClass01();
		//상속과 인스턴스 구현이 한번에 일어나는 것
		//익명클래스
	}
}

class MyClass01 {
	
}

class SubClass01 extends MyClass01 {
	//세모
}
