package ch02.lecture.p05print;

public class C03Print {
	public static void main(String[] args) {
		//printf
		//형식에 맞춰서 출력
		//첫파라미터(타입, 형식) 둘파라미터(값 - 값은 여러개일 수 있다)
		System.out.printf("어떤형식");
		System.out.println("또 다른 출력");
		//새로운 줄을 입력하지 않으면 출력되지 않는다
		
		//새로운 줄을 입력하는 형식은 %n
		System.out.printf("새로운 줄 포함 %n새로운 줄에 출력된다");
		
		//새로운 줄을 표현하는 형식 \n
		System.out.printf("\n역슬래쉬 사용 새줄 \n새로운 줄입니다");
		//둘 다 사용가능
		
		//%d - 10진법 정수로 출력하기 위한 코드
		System.out.println();
		System.out.printf("10진법 정수 %d", 99);
		System.out.printf("%n 또다른 정수 %d", 300);
//		System.out.printf("%n또다른 정수 %d", "삼백");
		//정수로 출력할 수없는 코드는 에러를 발생시킨다
//		System.out.printf("%n정수 %d", "3000");
//		System.out.printf("%n정수 %d", 3.14);
		
		// %f - 10진법 실수
		System.out.printf("%n10진법 실수 %f", 3.14);
		System.out.printf("%n10진법 실수 %f", 9.99999);
//		System.out.println("%n10진법 실수 %f", 3); //실수만 된다 정수는 안된다
//		System.out.println("%n10진법 실수 %f", "3.14"); //string타입도 안된다
		
		//%s - 문자열
		System.out.printf("%n문자열 %s", "hello world");
		System.out.printf("%n문자열 %s", 3.14);
		System.out.printf("%n문자열 %s", 99);
		
		System.out.printf("%n%s world", "hi");
		//기호가 있는 곳에 뒤에 있는 값이 추가 되는 것이다
		System.out.printf("%n%d 숫자", 999);
		System.out.printf("%n.....%f.....", 3.14);
	}
}
