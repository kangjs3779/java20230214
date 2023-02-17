package ch03.lecture.p06string;

public class C07Substring {
	public static void main(String[] args) {
		//substring
		//문자열의 일부(sunstring)를 리턴
		//resturn tyoe = String
		
		String str1 = "중국 재개방이 글로벌 인플레이션 촉발하지 않는 이유";
		//처번째 파라미터 : 시작 inex포함
		//두번째 파라미터 : 종료 index 포함안됨
		String res1 = str1.substring(0, 2); //중국이라는 문자를 뽑고 싶다면
		System.out.println(res1);
		
		//재개방을 뽑고 싶다면 첫파라미터는 제대로쓰고 둘파라미터는 +1을 해서 써줘야한다
		System.out.println(str1.substring(3, 6));
		
		//끝까지 뽑고 싶다면
		System.out.println(str1.substring(8, str1.length()));
		
		//파라미터 하나 : 시작 - 끝까지
		System.out.println(str1.substring(8));
		
		System.out.println(str1.substring(str1.length()-2));
		
		//파라미터가 인덱스를 벗어나면 오류가 발생함
		String str2 = "java";
		System.out.println(str2.substring(2, 4));
		System.out.println(str2.substring(2, 5)); //오류 길이보다 더큰 값을 적어버임
		
		
	}
}
