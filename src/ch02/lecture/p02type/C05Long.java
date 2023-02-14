package ch02.lecture.p02type;

public class C05Long {
	public static void main(String[] args) {
		//long
		// (8 byte, 64 bits)
		
		long l1 = 2147483647;
		l1 = 2147483648L; // long타입 수는 끝에 (L) 붙임
		l1 = 84_654_681_513_245L; //읽기 편하게 이렇게 끊어서 하면 된다
		
		long l2 = 1000000000000000L;
		System.out.println(l2);
	}
}
