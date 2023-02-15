package ch02.lecture.p02type;

public class C15String {
	public static void main(String[] args) {
		//String과 기본 타입과의 연산
		// +외에 안됨
		
		String s1 = "3";
		String s2 = "4";
		//System.out.println(s1 * s2); //안된다
		
		// + = 연결 연산(concatenate)
		System.out.println(s1 + s2); //더한값이 나오는 게 아니라 그냥 문자가 연결되어 나타난다
		
		int i3 = 4;
		String s3 = "5";
		System.out.println(i3 + s3);
		//더한 값이 나오지 않음, 그냥 연결되어 문자두개가 나온 거임
		
		System.out.println(3.14 + "hello"); //double과 string의 연결연산
		System.out.println(false + "hi"); //boolean과 string의 연결연산
		
		String r4 = 3 + 3 + "4";
		System.out.println(r4); //숫자로 쓰인건 더하기로 문자로 쓰인건 연결연산으로 쓰임
		
		//응용 기본타입 -> string
		//valueOf
		//연결연산
		int i6 = 99;
		String s6 = String.valueOf(i6);
		String s7 = 99 + "";
		
		System.out.println(s6);
		System.out.println(s7);
		
		boolean b8 = false;
		String s8 = String.valueOf(b8);
		String s9 = b8 + "";
		System.out.println(s8); //문자열
		System.out.println(s9); //문자열
		
	
	}
}
