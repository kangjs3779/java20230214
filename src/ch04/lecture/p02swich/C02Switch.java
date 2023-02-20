package ch04.lecture.p02swich;

public class C02Switch {
	public static void main(String[] args) {
		//break
		//switch 내 실행 흐름 종료
		int val = 2;
		
		switch(val) {
		case 1:
			System.out.println("code 1");
			break;
		case 2:
			System.out.println("code 2");
//			break;
		case 3:
			System.out.println("code 3");
//			break;
		default :
			System.out.println("끝");
			break;
			
		//순서대로 조건을 확인하고나서 조건에 맞으면 실행문을 실행한다
		//근데 break가 없으면 조건문 밖으로 빠져나가지 않아서 break를 만날 때까지
		//실행문을 실행한다
		}
	}
}
