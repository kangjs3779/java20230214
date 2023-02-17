package ch03.lecture.review;

public class review0217 {
	public static void main(String[] args) {
		String a = "일이삼사오육칠팔구십";
		int x = a.length();
		System.out.println(x);
		
		char x2 = a.charAt(5);
		System.out.println(x2);
		
		System.out.println(a.charAt(a.length()-a.length()));
	}
}
