package ch03.lecture.p03comparison;

public class C02String {
	public static void main(String[] args) {
		//문자열 같은 지 비교
		// == 사용하지 마세요!!
		//equals라는 method를 사용하세요!!
		
		String str1 = "java";
		String str2 = "java";
		
		boolean r1 = str1 == str2;
		System.out.println(r1);
		
		String str3 = "ja";
		String str4 = "va";
		String str5 = str3 + str4;
		
		System.out.println(str1);
		System.out.println(str5);
		
		boolean r2 = str1 == str5;
		System.out.println(r2); //그냥 쓰지마라
		
		//.equals 메소드를 사용하는게 낫다
		//같은지 비교함
		boolean r3 = str1.equals(str2);
		System.out.println(r3);
		
		boolean r4 = str1.equals(str5);
		System.out.println(r4);
		//값이 일정하게 true가 나옴
		
		//그냥 이거 쓰는게 좋음
		//!= 쓰지 말 것
		//.equals의 연산결과를 반전(!)
		boolean r5 = !str1.equals(str5); //!를 붙여주면 된다
		System.out.println(r5);
		//다른지 비교하고 싶을 떄
	}
}
