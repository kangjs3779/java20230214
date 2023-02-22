package ch05.lecture.p02reference;

public class C03Reference {
	public static void main(String[] args) {
		int a = 3; //1번 3
		
		method1(a);
		
		System.out.println(a); //5번 3
	}
	
	public static void method1(int b) {
		System.out.println(b); //2번 3
		b = 30; //3번
		System.out.println(b);//4번 30
	}
}
