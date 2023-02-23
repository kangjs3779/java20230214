package ch05.lecture.p04string;

public class C03Split {
	public static void main(String[] args) {
		//split
		//특정 문자 패턴으로 문자열을 나누어서 배열로 리턴
		
		String str1 = "hello, java, world, html, css";
		String[] arr1 = str1.split(",");
		System.out.println(arr1);
		
		String str2 = "spring react vue angular jsp sass";
		String[] arr2 = str2.split(" ");
		System.out.println(arr2);
		
		for(int a = 0; a < arr2.length; a++) {
			System.out.println(arr2[a]);
		}
		
		String str3 = "I'm ironman.";
		String[] arr3 = str3.split("");
		//한글자 한글자 나눠서 출력할 수 있게 된다
		System.out.println(arr3.length);
		System.out.println(arr3[arr3.length - 1]);
		System.out.println(arr3[5]);
		
	}
}
