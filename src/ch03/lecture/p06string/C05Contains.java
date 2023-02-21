package ch03.lecture.p06string;

public class C05Contains {
	public static void main(String[] args) {
		//contains
		// 특정 문자열이 있는 지 확인
		//있다 없다
		// return type = boolean
		
		String str1 = """
				동해물과 백두산이
				마르고 닳다록
				아아아
				""";
		
		boolean res1 = str1.contains("해물");
		System.out.println(res1);
		
		boolean res2 = str1.contains("아");
		System.out.println(res2);
	}
}
