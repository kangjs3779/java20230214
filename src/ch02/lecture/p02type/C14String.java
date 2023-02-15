package ch02.lecture.p02type;

public class C14String {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "h";
		//char c1 = (char) s2; //참조타입과 기본타입간 형변환은 안된다
		String s3 = "";
		
		//문자열(String)과 기본타입간 형변환
		
		//문자열 -> 기본타입(65p 표 참고) 메소드를 사용하면 된다
		String str1 = "300";
		int i1 = Integer.parseInt(str1);//.method에 접근을 하겠다
		
		
		System.out.println(i1);
		
		String str2 = "90000000000000000";
		long l2 = Long.parseLong(str2);
		System.out.println(l2);
		
		String str3 = "3.14";
		double d3 = Double.parseDouble(str3);
		System.out.println(d3);
		
		String str4 = "9.99";
		float f4 = Float.parseFloat(str4);
		System.out.println(f4);
		
		String str5 = "true";
		boolean b5 = Boolean.parseBoolean(str5);
		System.out.println(b5);
		
		// 기본타입 -> 문자열(String)
		//valueOf 메소드 사용
		System.out.println("*********************");
		
		int i6 = 700;
		String str6 = String.valueOf(i6);
		System.out.println(str6);
		
		long l7 = 99999999999L;
		String str7 = String.valueOf(l7);
		System.out.println(str7);

		double d8 = 3.14;
		String str8 = String.valueOf(d8);
		System.out.println(str8);

		boolean b9 = true;
		String str9 = String.valueOf(b9);
		System.out.println(str9);

	}
}
