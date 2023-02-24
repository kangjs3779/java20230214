package ch05.lecture.p08regex;

import java.util.Arrays;

public class C01RegularExpression {
	public static void main(String[] args) {
		//regular expression
		//정규식, 정규표현식,정규식표현
		//v패턴을 표현하는 문자열
		
		String str = "java,   css    ,   html    ,         spring";
		String[] arr1 = str.split(",");
		System.out.println(Arrays.toString(arr1));
		//,만을 기준으로 해서 공백도 포함된다
		
		//공백없이 원소를 뽑고 싶으면??
		String[] arr2 = str.split(" ,\\s*");
		System.out.println(Arrays.toString(arr2));
		//공백을 없애는 패턴 \\s*
	}
}
