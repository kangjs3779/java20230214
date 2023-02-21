package ch04.lecture.ex;

import java.util.Scanner;

public class check07 {
	public static void main(String[] args) {
		Scanner scanner1 = new Scanner(System.in);
		boolean a = true;
		int total = 0;
		
		while (a) {
			System.out.println("-------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4.종료");
			System.out.println("-------------------------------------");
			
			System.out.print("선택> ");
			String str = scanner1.nextLine();
			
			if(str.equals("1")) {
				Scanner scanner2 = new Scanner(System.in);
				System.out.print("예금액> ");
				int blank1 = scanner2.nextInt();
				total += blank1;
				
			} else if(str.equals("2")) {
				Scanner scanner3 = new Scanner(System.in);
				System.out.print("출금액> ");
				int blank2 = scanner3.nextInt();
				total -= blank2;
			} else if(str.equals("3")) {
				
				System.out.println("잔고> " + total);
			} else if (str.equals("4")) {
				a = false;
				System.out.println("프로그램 종료");
			}
				
			
		}
	}
}
