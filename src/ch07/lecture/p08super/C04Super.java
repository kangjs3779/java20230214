package ch07.lecture.p08super;

public class C04Super {
	public static void main(String[] args) {
		Sub04 a = new Sub04();
		a.method3();
		
	}
}

class Super04 {
	public void method1() {
		
	}
	public void method3() {
		
	}
}

class Sub04 extends Super04 {
	@Override
	public void method3() {
		method1();//앞에 super.가 있는데 생략이 된 것이다. 뭐가 뭔지 뻔히 보이니까
//		method3(); //위에 있는 애가 아니라 오버라이드한 자기자신을 호출한다
		super.method3(); //부모클래스의 method3 위에 있는 애
		
	}
	public void method2() {
		method1();
	}
}
