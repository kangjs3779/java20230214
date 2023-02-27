package ch06.lecture.p3method;

public class C04Parameter {
	public static void main(String[] args) {
		MyClass04 o1 = new MyClass04();
		o1.method1();
		
		//메소드 실행 시 정의된 파라미터 타입과 순서, 개수에 맞춰서
		//아큐먼트 입력(전달)
		
		o1.method2(5);
		//o1.method2(); = 안된다
		
		o1.method3("hello");
		
		String s1 = "java";
		o1.method3(s1);
		o1.method3(null);
		
		String s2 = null;
		o1.method3(s2);
		
		o1.method4(3,5);
		
		o1.method5("가", "나");
		
		o1.method6(5, "이거");
		
		o1.method7("d이거", 8);
	}

}
