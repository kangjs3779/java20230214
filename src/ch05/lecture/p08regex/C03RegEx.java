package ch05.lecture.p08regex;

public class C03RegEx {
	public static void main(String[] args) {
		//character class(문자 분류)
		System.out.println("a".matches("[abc]"));
		//분류된 문자 중의 하나인가?
		System.out.println("b".matches("[abc]"));
		System.out.println("c".matches("[abc]"));
		System.out.println("d".matches("[abc]"));
		
		
		
	}
}
