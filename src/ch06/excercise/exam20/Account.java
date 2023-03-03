package ch06.excercise.exam20;

import java.util.*;

public class Account {
	public static void main(String[] args) {
		BankApplication o1 = new BankApplication();
		String list = """
				----------------------------------------------------
				1.계좌 생성 | 2.계좌 목록 | 3.예금 | 4.출금 | 5.종료
				----------------------------------------------------
				""";
		boolean run = true;
		
		while(run) {
			System.out.print(list);
			Scanner scanner = new Scanner(System.in);
			System.out.print("선택 > ");
			String choose = scanner.nextLine();
			System.out.println();
			switch (choose) {
				case "1":
					String createAccount = """
							-------------
							계좌 생성
							-------------
							""";
					System.out.println(createAccount);
					o1.createAccount();
					break;
				case "2":
					String accountList = """
							-------------
							계좌 목록
							-------------
							""";
					System.out.println(accountList);
					o1.accountList();
					break;
				case "3":
					String plus = """
							-------------
							예금
							-------------
							""";
					System.out.println(plus);
					o1.plus();
					break;
				case "4":
					String minus = """
							-------------
							출금
							-------------
							""";
					System.out.println(minus);
					o1.minus();
					break;
				case "5":
					String end = "프로그램 종료";
					System.out.println(end);
					run = false;
					break;
			}
		}
	}
}
