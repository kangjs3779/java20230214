package ch03.lecture.p01arithmetic;

public class C04Overflow {
	public static void main(String[] args) {
		//흘러넘친다
		int a = 15_0000_0000;
		int b = 17_0000_0000;
		
		System.out.println(a);
		System.out.println(b);
		
		int c = a + b;
		System.out.println(c);
		//int의 허용범위가 넘어갔기 때문에 결과값이 이상하게 나옴
		//long으로 적어 줘야함
		long a = 15_0000_0000;
		long b = 17_0000_0000;
		
		System.out.println(a);
		System.out.println(b);
		
		// overflow : 타입의 최대허용값 벗어남
		long c = a + b;
		System.out.println(c);
		
		int d = -15_0000_0000;
		int e = -17_0000_0000;
		
		System.out.println(d);
		System.out.println(e);
		//unerflow 타입의 최소값 벗어남
		//선생님 코드 봐보기
		
		
	}
}
