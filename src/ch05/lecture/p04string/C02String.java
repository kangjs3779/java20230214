package ch05.lecture.p04string;

public class C02String {
	public static void main(String[] args) {
		String str1 = new String("java");
		String str2 = "java";
		String str3 = "java";
		
		
//		System.out.println(str2 == str3);
//		//new를 생략했을 때 값을 비교하면 true가 나온다
//		//string만 이런 특징이 있음
//		//리터럴 값을 재사용함 그래서 값이 같다고 나온다(new를 생략했을 때만)
//		
//		System.out.println(str1 == str2);
		//str1은 new를 사용해서 새로운 저장공간에 저장이 되었기 때문에
		//str2와는 다르다
		
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		//안에 있는 문자열을 비교하고 싶을 때 이렇게 사용하면 된다
	}
}
