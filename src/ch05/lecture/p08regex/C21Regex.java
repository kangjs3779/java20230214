package ch05.lecture.p08regex;

public class C21Regex {
	public static void main(String[] args) {
		//word character
		// \w
		
		String pattern1 = "\\w"; //스트링에서 역슬래쉬를 표현하고 싶으면 역슬래쉬 두개 쓰기
		String pattern2 = "[0-9a-zA-Z_]";
		
		System.out.println(pattern1);
		System.out.println("a".matches(pattern1));
		System.out.println("a".matches(pattern2));
		System.out.println("C".matches(pattern2));
		System.out.println("5".matches(pattern2));
		System.out.println("_".matches(pattern2));
		
		// 영문대소문자 숫자 언더스코어로 이루어진 단어 2개로만 표현된 문자열
		String pattern3 = "\\s*\\w+\\s+\\w+\\s*";
		
		System.out.println("hello world".matches(pattern3));
		System.out.println("hello        world           ".matches(pattern3));
		System.out.println(" my_name 01088888".matches(pattern3));
	}
}
