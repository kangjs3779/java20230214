package ch05.review;

public class review1 {
	public static void main(String[] args) {
		String str1 = new String("java");
		String str2 = new String("java");

		System.out.println(str1.equals(str2));
//		System.out.println(str2);
		char c1 = '가';
		char c2 = '나';
		
		System.out.println(c1 + c2); //유니코드로 변경되어서 더하기 연산자로 됨 = int로 나온다
		System.out.println("" + c1 + c2); //문자의 연결연산자로 쓰고 싶으면 빈공간의 string을 넣어주면 된다
	}
}
