package ch02.lecture.p02type;

public class C07char {
	public static void main(String[] args) {
		//char - 문자
		//하나의 문자값 저장
		//2 bytes(16 bits)
		//0 ~ 65535까지 표현할 수 있다 (음수없음 코드임 = 문자)
		//unicode : 세계 각국의 문자를 위의 숫자로 매핑한 국제 표준 규약이다
		
		char c1 = 65261;
		
		System.out.println(c1);
		
		char c2 = 8594;
		
		System.out.println(c2);
		
		char c3 = '\u53f8';
		
		System.out.println(c3);
		
		char c4 = 'a';
		System.out.println(c4);
		
		char c5 = '가';
		System.out.println(c5);
		
		//char c6 = 'ab' //하나의 문자만 가능
		//char c7 =''// 하나의 문자만 가능
		//비어있어도 안되고 두개 이상인 것도 안된다.
		
		char c8 = 'b';
		
		int d = c8 - c4;
		System.out.println(d);
	}
}
