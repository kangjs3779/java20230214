package ch05.lecture.p08regex;

public class C12Regex {
	public static void main(String[] args) {
		//수량 3-4 : {3, 7}
		String pattern = "a{1,3}"; //a의 개수가 0<a<4 라는 뜻이다
		
		System.out.println("a".matches(pattern));
		System.out.println("aa".matches(pattern));
		System.out.println("aaaa".matches(pattern)); //4개라서 안됨
		System.out.println("".matches(pattern));//없어서 안됨
		System.out.println("abc".matches(pattern));//문자가 달라서 안됨
		
	}
}
