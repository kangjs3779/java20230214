package ch03.lecture.p06string;

public class C08StartWith {
	public static void main(String[] args) {
		//startsWith
		//특정 문자열로 시작하는 지?
		//return type : boolean
		
		// codingbat 문제: Warmup-1, notString
		
		String str1 = "spring";
		System.out.println(str1.startsWith("s"));
		System.out.println(str1.startsWith("sp"));
		System.out.println(str1.startsWith("pr"));
		
		//endsWith
		//특정 문자열로 끝나는 지?
		//return type : boolean
		System.out.println(str1.endsWith("g"));
		System.out.println(str1.endsWith("ng"));
		System.out.println(str1.endsWith("s"));
	}
}
