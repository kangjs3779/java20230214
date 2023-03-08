package ch12.review;

public class Villain {
	public static void main(String[] args) {
		Review me = new Review(5, 5, 5);
		Review mother = new Review(4, 5, 5);
		Review brother = new Review(5, 5, 5);
		
		me.print_review();
		mother.print_review();
		brother.print_review();
	}
}

class Review {
	public int taste;
	public int amount;
	public int deliver_time;
	
	public Review(int taste, int amount, int deliver_time) {
		this.taste = taste;
		this.amount = amount;
		this.deliver_time = deliver_time;
	}
	
	public void print_review() {
		System.out.println("맛 :" + taste);
		System.out.println("양 :" + taste);
		System.out.println("배달시간 :" + taste);
		System.out.println();
	}
}
