package ch12.lecture.p02wrapper;

public class C07UnBoxing {
	public static void main(String[] args) {
		Integer i1 = 300000;
		
		int r1 = i1 + 4000;
		
		System.out.println(r1);
		
		Object o1 = 3000; //autoBoxing, type conversion
//		int r2 = o1 + 50000; //xxx
		
		int r2 = ((Integer) o1) + 50000; //위험한 코드
		
		int r4 = ((int) o1) + 50000;
		System.out.println(r2);
		System.out.println(r4);
	}
}
