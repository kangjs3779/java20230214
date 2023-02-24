package ch05.lecture.p08regex;

public class C13Regex {
	public static void main(String[] args) {
		//3개 이상 : {3,}
		
		//숫자가 2개이상 표현되어야 한다
		String pattern = "[0-9]{2,}";
		
		System.out.println("09".matches(pattern)); // 숫자 2개라서 됨
		System.out.println("aa".matches(pattern)); //문자 2개라서 안됨
		System.out.println("".matches(pattern)); //없어서 안됨
		System.out.println("aaaa".matches(pattern));//문자4개라서 안됨
		System.out.println("abc".matches(pattern));//문자 3개라서 안됨
	}
}
