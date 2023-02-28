package ch06.lecture.p05final;

public class C01Final {
	public static void main(String[] args) {
		//final 최종 더 이상 값을 변경할 수 없음
		//값을 한번만 할당할 수 있다
		int a = 3;
		a = 5; // 다시 할당함
		
		final int b = 5;
//		b = 7; 이건 안된다
		//0번 2번이상 안된다 꼭 한번만 할당해야 한다
	}
	
	static void method(int i) {
		System.out.println(i);
		i = 5;
		System.out.println(i);
	}
	
	static void method1(final int i) {
		System.out.println(i);
//		i = 9; 이건 안된다 final 이니까
		System.out.println(i);
	}
}
