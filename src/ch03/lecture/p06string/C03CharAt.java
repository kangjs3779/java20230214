package ch03.lecture.p06string;

public class C03CharAt {
	public static void main(String[] args) {
		//charAt
		//특정 위치(index)에 있는 문자 확인
		//return type = char
		
		String str1 = "spring";
		System.out.println("길이: " + str1.length());
		//0부터 시작함
		
		int a = 0;
		char c1 = str1.charAt(a);
		System.out.println(c1);
//		System.out.println(str1.charAt(2));
//		System.out.println(str1.charAt(5));
//		System.out.println(str1.charAt(str1.length()-1));
		//마지막 글자의 인덱스는 언제나 전체길이에서 -1과 같음
	}
}
