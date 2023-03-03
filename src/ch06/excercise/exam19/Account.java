package ch06.excercise.exam19;

public class Account {
	private static int balance = 0;
	final static int MIN_BALANCE = 0;
	final static int MAX_BALANCE = 1000000;
	

	
	public int getBalance() {
		return this.balance;
	}
	
	public int setBalance(int balance) {
		if( balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		} else {
			balance = this.balance;
		}
		return this.balance;
	}
}
