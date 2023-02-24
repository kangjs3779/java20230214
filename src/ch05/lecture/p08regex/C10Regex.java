package ch05.lecture.p08regex;

public class C10Regex {
	public static void main(String[] args) {
		//quantifier(수량자)
		
		//숫자가 3개인가??
		System.out.println("010".matches("[0-9][0-9][0-9]"));
		System.out.println("010".matches("[0-9]{3}"));
		System.out.println("123".matches("[0-9]{3}"));
		System.out.println("12".matches("[0-9]{3}"));
		System.out.println("1233".matches("[0-9]{3}"));
		System.out.println("abo".matches("[0-9]{3}"));
		//{}안에 있는 숫자는 []가 몇번 반복되는가?라는 뜻을 가짐
	}
}
