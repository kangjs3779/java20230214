package ch15.exercise.check0620;

import java.util.*;

public class BankExample {
	public static void main(String[] args) {
		List<String> account = new ArrayList<String>();
		List<String> accNum = new ArrayList<String>();
		List<Integer> accDeposit = new ArrayList<Integer>();
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		//계좌번호 
		String accountNum = "";
		//계좌주
		String accountName = "";
		//초기입금액
		int deposit = 0;
		
		while (run) {
			System.out.println("""
					------------------------------------------
					1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료
					------------------------------------------
					""");
			System.out.print("선택>");
			int num = scan.nextInt();
			switch(num) {
			case 1 : System.out.println("""
					--------
					계좌생성
					--------
					""");
					System.out.print("계좌번호: ");
					accountNum = scan.next();
					System.out.print("계좌주: ");
					accountName = scan.next();
					System.out.print("초기입금액: ");
					deposit = scan.nextInt();
					account.add(accountName + "\t" + accountNum + "\t" + deposit);
					accNum.add(accountNum);
					accDeposit.add(deposit);
					System.out.println("계좌가 생성되었습니다");
					
			break;
			
			
			case 2 : System.out.println("""
					--------
					계좌목록
					--------
					""");
					for(String a : account) {
						System.out.println(a);
					}
			break;
			
			
			case 3 : System.out.println("""
					--------
					예금
					--------
					""");
					System.out.print("계좌번호 : ");
					String inputAccount = scan.next();
					for (int a = 0; a < account.size(); a++) {
						String compare = accNum.get(a);
						if(inputAccount.equals(compare)) {
							System.out.print("예금액 : ");
							int inputMoney = scan.nextInt();
							inputMoney += accDeposit.get(a);
							System.out.println("총액: " + deposit);
						} 
					}
					
			break;
			
			
			case 4 : System.out.println("""
					--------
					출금
					--------
					""");
				System.out.print("계좌번호 : ");
				String outputAccount = scan.next();
				for (int a = 0; a < account.size(); a++) {
					String compare = accNum.get(a);
					if(outputAccount.equals(compare)) {
						System.out.print("출금액 : ");
						int outputMoney = scan.nextInt();
						outputMoney -= accDeposit.get(a);
						System.out.println("총액: " + deposit);
					} 
				}
			break;
			
			
			case 5 : System.out.println("""
					--------
					종료
					--------
					""");
			System.out.println("프로그램 종료");
			run = false;
			
			break;
			
			}
		}
	}
}
