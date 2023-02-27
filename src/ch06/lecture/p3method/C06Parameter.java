package ch06.lecture.p3method;

public class C06Parameter {
	public static void main(String[] args) {
		//자동형변환
		
		
		MyClass06 o1 = new MyClass06();
		o1.method1(33);
		o1.method1('c');
		
		o1.method2(1464654655757687687L);
		o1.method3(33);
		
		o1.method4(3.14f);
		o1.method4(198342L);
		o1.method4(99);
//		o1.method4(3.14); float type이라서 자종 형변환이 안된다
	}
}
