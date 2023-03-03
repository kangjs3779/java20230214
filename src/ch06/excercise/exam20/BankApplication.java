package ch06.excercise.exam20;

import java.util.*;

public class BankApplication {
	//field
	Scanner scan = new Scanner(System.in);
	private String[] Account = new String[100];
	private String[] accountNumber;
	private String[] name;
	private int[] deposit;
	private int inputmoney;
	private int outputMoney;
	
	public void createAccount() {
		System.out.print("계좌번호 : ");
		String number = scan.next();
		System.out.print("계좌주 : ");
		String name = scan.next();
		System.out.print("초기입금액 : ");
		int deposit = scan.nextInt();
	}
	
	public void accountList() {
		
	}

	public void plus() {
		
	}
	
	public void minus() {
		
	}

}
