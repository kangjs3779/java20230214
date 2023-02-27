package ch05.lecture.p08regex;

import java.util.Arrays;

public class C20Regex {
	public static void main(String[] args) {
		String str1 = "  al ad al      dsklf a s aslkd   rejksld  fkdjf";
		String str2 = str1.replaceAll("\\s+", "");
		
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = "sdlkfsldkf   ,     sdfsdfd,sdkfjsldkf     ,    kjsldkfj";
		//split해서 뽑아내고 싶다
		String[] str4 = str3.split("\s*,\s*");
		
		System.out.println(Arrays.toString(str4));
	}
}
