package ch02.lecture.p02type;

public class C10String {
	public static void main(String[] args) {
		//string (참조타입)
		//문자열 저장
		
		String s1;
		s1 = "hello world";
//		
//		s1 = "h";
//		
//		s1 = "";
		System.out.println(s1);
		
		char c1 = '가';
		
		//1 = c1; //안된다 자바는 타입에 민감함
		//문자열은 ""
		//문자는 ''
		
		String s2 = "i am\"ironman\"";
		//큰따옴표 안에 큰따옴표를 쓰고 싶으면 역슬래시 사용하면 된다
		System.out.println(s2);
		
		String s3 = "i\\";
		System.out.println(s3);
		//역슬래시를 쓰고 싶으면 두개를 쓰면 한개가 출력된다
		
		String s4 = "i am \n ironman.";
		System.out.println(s4);
		//출력할 때 줄을 바꿔준다
		
		String s5 = "<h1>hello \n\t<span>world</span>\n</h1>";
		System.out.println(s5);
		//\t는 탭만큼 들여 쓴다
		
		String s6 = """
				<h1>
					'hello'
					<span>"world"</span>
				</h1>""";
		System.out.println(s6);
		//세개의 큰따옴표로 시작해서 끝남 - 내가 쓰는 데로 그대로 출력된다
		//첫번째 엔터는 무시한다
		//가장 작은 들여쓴 줄이 들여쓰기 기준
		//마지막 큰따옴표를 기준으로 작성을 하면 좋다
		//여러 줄을 작성할 때 간결하고 가독성 좋게 작성할 수 있다
		
	}

}
