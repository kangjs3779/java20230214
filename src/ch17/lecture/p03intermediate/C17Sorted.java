package ch17.lecture.p03intermediate;

import java.util.*;

public class C17Sorted {
	public static void main(String[] args) {
		List<Movie> movie = List.of(
				new Movie("avatar", 10000),
				new Movie("slamdunk", 9000),
				new Movie("avengers", 7000),
				new Movie("titanic", 15000));

		movie.stream()
				.sorted((a, b) -> a.getPrice() - b.getPrice())
				//comparable을 구현하지 않았으면 파라미터로 comparator를 지정해주면 된다
				.forEach(System.out::println);
		
		System.out.println();
		movie.stream()
		.sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
		.forEach(System.out::println);

	}
}

class Movie {
	private String title;
	private int price;

	public Movie(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public String getTitle() {
		return title;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return title + price;
	}
}