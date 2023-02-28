package ch06.lecture.p03method;

public class C13Return {
	public static void main(String[] args) {
		MyClass13 o1 = new MyClass13();
		o1.method1(); //= 3
		//return값 때문에
		System.out.println(o1.method1());
		
		int var1 = o1.method1();
		//return값과 동일한 변수타입에 값을 넣어서 출력하면 된다
		System.out.println(var1);
		
		int var2 = o1.method1() * 2; 
		System.out.println(var2);
		
		String var3 = o1.method2();
		System.out.println(var3);
		
		String var4 = o1.method2() + "java";
		System.out.println(var4);
		
		System.out.println(o1.method2());
		
		//자동형변환
		long var5 = o1.method1();
		
	}
}
