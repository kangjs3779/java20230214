package ch05.sec05;

public class ReplaceExample {
	public static void main(String[] args) {
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다";
		String newStr = oldStr.replace("자바", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);
		//값이 같았다면 같은 값을 공유했을 텐데
		//replace를 통해서 값이 달라져서
		//heap영역에 저장공간을 새로 만들어서 저장되었다
		//그래서 두개의 변수에 저장된 값도 다르고 저장된 곳의 값도 다르다
		System.out.println(oldStr == newStr); //가리키는 곳이 다름
			
	}
}
