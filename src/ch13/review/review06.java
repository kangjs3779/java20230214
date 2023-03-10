package ch13.review;

public class review06 {

	public static void main(String[] args) {
		ReviewClass06 o1 = new ReviewClass06();
		
		o1.method1(33);
		o1.method1(33.33);
		o1.method1(3333L);
		o1.method1(33.333F);
		o1.method1('3');
		o1.method1("33");
		
		System.out.println();
		//타입을 안써주면 가장 상위 클래스의 타입이 된다
		
		ReviewClass06<Integer> o2 = new ReviewClass06<>();
		
		o2.method1(33);
		o2.method1(33.3);
		o2.method1("java");
		
		
	}
}

class ReviewClass06 <T super Number> {
	private T field1;
	
	public T method1(T field1) {
		System.out.println(field1);
		return field1;
	}
	
	
}
