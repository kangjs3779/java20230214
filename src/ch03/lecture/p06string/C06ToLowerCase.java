package ch03.lecture.p06string;

public class C06ToLowerCase {
	public static void main(String[] args) {
		//toLowerCase
		//문자열을 소문자로 바꾼 문자열 리턴
		//return type = string
		
		
		//toUppercase
		//대문자로 바꾼 문자열 리턴
		//return type = string
		
		String str1 = "i'm Ironman.";
		String res1 = str1.toLowerCase();
		System.out.println(str1);
		System.out.println(res1);
		
		String res2 = str1.toUpperCase();
		System.out.println(res2);
		
		//대소문자 구분없이 문자열 위치 확인
		String res3 = str1.toLowerCase();
		System.out.println(res3.indexOf("ir"));
		System.out.println(str1.toLowerCase().indexOf("ir"));
		
		//대소문자 구분없이 특정 문자열이 있는 지 확인
		String str4 = "lorem ipsum";
		
		String res4 = str4.toLowerCase();
		System.out.println(str4.contains("sum"));
		System.out.println(res4.contains("sum"));
		
		System.out.println(str4.toUpperCase().contains("sum"));
	}
}
