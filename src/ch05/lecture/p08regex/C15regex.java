package ch05.lecture.p08regex;

public class C15regex {
	public static void main(String[] args) {
		//{0,}
		//* : 0개 이상
		
		String pattern1 = "[0-9]{0,}";
		String pattern2 = "[0-9]*";
		
		System.out.println("".matches(pattern1));
		System.out.println("".matches(pattern2));
		
		//숫자로만 이루어져있고 0개 이상이라면 true가 나온다
	}
}
