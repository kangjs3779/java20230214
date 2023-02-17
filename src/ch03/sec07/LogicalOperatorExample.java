package ch03.sec07;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode = 'A'; //아스키코드
		//int charcode = 'a';
		//int charcode = '5';
		
		if ((65 <= charCode) & (charCode <= 90)) {
			System.out.println("대문자이군요");
		}
		
		if (('A' <= charCode) && (charCode <= 'z')) {
			System.out.println("대문자이군요");
		} //이렇게 작성해도 된다 가독성이 좋아야 좋은 거임 
		
		if((97 <= charCode) && (charCode <= 122)) {
			System.out.println("소문자이군요");
		}
		
		if((48 <= charCode) && (charCode <= 57)) {
			System.out.println("0~9 숫자군요");
		}
		
		
		//--------------------------------------------------
		
		int value = 6;
		//int value = 7;
		
		if ( (value%2 == 0) | (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수이군요");
		}
		
		boolean result = (value % 2 == 0) || (value % 3 == 0);
		if(!result) {
			System.out.println("2 또는 3의 배수가 아니군요");
		}
	}
}
