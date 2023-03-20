package ch17.review;

import java.util.*;
import java.util.stream.*;


public class R02 {
	public static void main(String[] args) {
		List<Book> list = List.of(
				new Book("slamdunk", 3000),
				new Book("avatar", 4000),
				new Book("the glory", 5000),
				new Book("avengers", 2000));
		
		int sum = list.stream()
				.map(n -> n.getPrice())
				.reduce((a,b) -> a + b)
				.get();
		System.out.println(sum);
		
	}
}

class Book {
	// field
	private String title;
	private int price;

	// constructor
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}

	// getter
	public int getPrice() {
		return price;
	}

	public String getTitle() {
		return title;
	}

	// setter
	public void setPrice(int price) {
		this.price = price;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}