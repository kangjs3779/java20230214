package ch07.review;

public class Review01 {
	public static void main(String[] args) {
		Class01 var1 = Class01.getInstance();
		Class01 var2 = Class01.getInstance();
		
		System.out.println(var1);
		System.out.println(var2);
		
//		System.out.println(Class01.getInstance());
	}
}
