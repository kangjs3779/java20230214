package ch06.lecture.p03method;

public class C09VarArgs {
	public static void main(String[] args) {
		MyClass09 o1 = new MyClass09();
		o1.method1();
		o1.method1(1);
		o1.method1(1, 2);
		
		o1.method2(new int[] {});
		o1.method2(new int[] {3});
		o1.method2(new int[] {9, 10});
		
		o1.method3(); //출력된게 없음 아규먼트 만큼출력된다
		o1.method3(5);
		o1.method3(100, 200);
		o1.method3(99, 88, 77, 66, 55);
		o1.method3(new int[] {0,3,5,9});
		//이렇게 적을 수도 있음 잘 사용하지 않음
		//값을 배열로 받으니까 배열로 받을 수 있음
	}
}
