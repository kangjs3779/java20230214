package ch05.lecture.p08regex;

public class C09Regex {
	public static void main(String[] args) {
		//charater class
		//negation(not)
		//그 문자를 제외하고
		
		//숫자가 아니면 일치
		System.out.println("0".matches("[^0-9]")); //false
		System.out.println("a".matches("[^0-9]")); //숫자가 아니라서  true
		System.out.println(" ".matches("[^0-9]"));
		System.out.println("_".matches("[^0-9]"));
		//숫자만 아니면 다 true가 나온다
	}
}
