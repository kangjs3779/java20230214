package ch17.lecture.p02terminal;

public class StringBuilderExample {
	public static void main(String[] args) {
		//StringBuilder vs String
		
		//StringBuilder는 문자열 수정 가능
		//String 문자열 수정 불가
		
		String a = "JAVA"; //hello라고 붙이고 싶음 다른 문자로 변경할 수 없음
		String b = "html";
		
		//그럼 java랑 hello를 연결하고 싶으면??
		//객체를 새로만들어서 붙여야 함
		String c = a + "hello";
		String d = b + "hello";
		System.out.println(c);
		
		//새로운 객체를 만들어야 한다
		StringBuilder e = new StringBuilder("java");
		StringBuilder f = new StringBuilder("html");
		
		System.out.println(e);
		System.out.println(f);
		
		e.append("hello");
		f.append("hello");
		
		System.out.println(e);
		System.out.println(f);
		
	}
}
