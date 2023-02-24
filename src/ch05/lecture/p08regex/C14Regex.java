package ch05.lecture.p08regex;

public class C14Regex {
	public static void main(String[] args) {
		//{1,} 1개 이상
		
		String pattern1 = "[a-z]{1,}";
		String pattern2 = "[a-z]+";
				
		System.out.println("abc".matches(pattern1)); //문자이고 1개이상이라서 됨
		System.out.println("a".matches(pattern1));//소문자에 1개이상이라서 됨
		System.out.println("A".matches(pattern1));//대문자라서 안됨
		
		System.out.println("abx".matches(pattern2));//문자이고 1개 이상이라서 됨
		System.out.println("a".matches(pattern2));
		System.out.println("ab".matches(pattern2));
		System.out.println("".matches(pattern2));//없어서 안됨
	}
}
