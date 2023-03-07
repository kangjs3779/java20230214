package ch07.lecture.p05polymorphism;

public class C01Polymorphism {
	public static void main(String[] args) {
		Integer i1 = new Integer(33);//중요도가 떨어져서 사용하는 것을 권장하지 않다
		Integer i2 = new Integer("33");
		
		Number n1 = i1;
		Number n2 = i2;
		
		Object o1 = i1;
		Object o2 = i2;
		
		//integer -> number -> object
		
		Number n3 = new Number();//추상 클래스라서 새로운 인스턴스를 만들 수 없다
	}
}
