package ch08.sec10.exam01;

public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a;
		
		a = b;
		a = c;
		a = d;
		a = e;
		//모두 자동타입 변환이 되었다
	}
}
