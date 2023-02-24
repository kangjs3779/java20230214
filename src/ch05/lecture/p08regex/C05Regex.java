package ch05.lecture.p08regex;

public class C05Regex {
	public static void main(String[] args) {
		//character class
		System.out.println("a".matches("[abcdefghijklnmopqrxtuvwxyz]"));
		System.out.println("b".matches("[abcdefghijklnmopqrxtuvwxyz]"));
		System.out.println("c".matches("[abcdefghijklnmopqrxtuvwxyz]"));
		System.out.println("d".matches("[abcdefghijklnmopqrxtuvwxyz]"));
		
		System.out.println("d".matches("[a-z]")); //범위를 나타낸다
		
		
	}
}
