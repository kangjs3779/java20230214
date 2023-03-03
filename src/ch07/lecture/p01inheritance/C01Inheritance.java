package ch07.lecture.p01inheritance;

public class C01Inheritance {
	public static void main(String[] args) {
		MyClass02 o1 = new MyClass02();
		o1.field1 = "aaa";
		
		MyClass01 o2 = new MyClass01();
		o2.method1();
		o2.method2();
		
		MyClass02 o3 = new MyClass02();
		o3.method1();
		o3.method2();
		//상속받았기 때문에 MyClass02에 method1/2모두 선언되지 않았어도
		//MyClass01에서 끌고 와서 쓸 수 있다
	}
}
