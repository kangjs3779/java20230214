package ch04.lecture.p02swich;

public class C01Swich {
	public static void main(String[] args) {
		//switch
		//값에 따라 실행 흐름을 변경할 때 사용
		int val = 3;
		switch (val) {
		case 1: //case옆에 값을 써주면 된다
			System.out.println("code1");
			break;
		case 2:
			System.out.println("code2");
			break;
		case 3:
			System.out.println("code3");
			break;
		default:
			System.out.println("code4");
			break; //이 브레이크는 써도되고 안써도 된다
		}
		//switch 옆에 있는 값과 case옆에 있는 값을 순서대로 확인한다
		//break를 만날 때까지 확인을 한다
		
		//if문으로 바꾸기
		
		if (val == 1) {
			System.out.println("code1");
		} else if(val ==2) {
			System.out.println("code2");
		} else if(val == 3) {
			System.out.println("code3");
		} else {
			System.out.println("code4");
		}
	}
}
