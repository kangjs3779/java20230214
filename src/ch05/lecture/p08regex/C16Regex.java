package ch05.lecture.p08regex;

public class C16Regex {
	public static void main(String[] args) {
		//{0, 1}
		//? : 0또는 1개
		
		String pattern1 = "[0-9]{0,1}";
		String pattern2 = "[0-9]?";
		
		System.out.println("0".matches(pattern1));
		System.out.println("0".matches(pattern2));

		System.out.println("".matches(pattern1));
		System.out.println("0".matches(pattern2));
		System.out.println("0".matches(pattern1));
		System.out.println("0".matches(pattern2));
		System.out.println("0".matches(pattern1));
		System.out.println("0".matches(pattern2));
		System.out.println("0".matches(pattern1));
	}
}
