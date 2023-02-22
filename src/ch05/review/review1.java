package ch05.review;

public class review1 {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4};
		int[] b = a;
		
//		System.out.println(a[0]);
//		System.out.println(b[0]);
		
		a[0] = 99;
		System.out.println(a[0]);
		System.out.println(b[0]);
	}
}
