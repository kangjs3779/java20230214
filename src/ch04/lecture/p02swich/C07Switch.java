package ch04.lecture.p02swich;

import java.util.Scanner;

public class C07Switch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("주민등록번호 7번째자리");
		int num = scanner.nextInt();
		
		String gender1 = "";
		
		switch(num) {
		case 1:
		case 2:
			gender1 = "남자";
			break;
		case 3:
		case 4:
			gender1 = "여자";
			break;
		default:
			gender1 = "잘 못 입력함";
		}
		
		System.out.println("입력된 성별은" + gender1 + "입니다.");
		
		
		//다른방법
		
		String gender2 = switch(num) {
						case 1, 3 -> "남자";
						case 2, 4 -> "여자";
						default -> "잘 못 입력";
						};
		System.out.println("입력된 성별은" + gender2 + "입니다.");

	}
}
