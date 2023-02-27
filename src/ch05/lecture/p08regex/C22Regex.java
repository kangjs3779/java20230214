package ch05.lecture.p08regex;

public class C22Regex {
	public static void main(String[] args) {
		// 모든 문자
		//any character(may or may not match line terminators)
		// .
		// line terminator는 맞을 수도 있고 아닐 수도 있다
		
		String pattern1 = ".";
		
		System.out.println("a".matches(pattern1));
		System.out.println("Z".matches(pattern1));
		System.out.println(" ".matches(pattern1));
		System.out.println("\n".matches(pattern1));
		
		String pattern2 = ".{3}"; //어떤 문자든 3개로 이루어져 있다
		System.out.println("가나다".matches(pattern2));
		System.out.println("   ".matches(pattern2));
		System.out.println("가 a".matches(pattern2));
	}
}
