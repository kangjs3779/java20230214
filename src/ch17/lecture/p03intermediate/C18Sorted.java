package ch17.lecture.p03intermediate;

import java.util.*;

public class C18Sorted {
	public static void main(String[] args) {
		List<Car> list = List.of(
				new Car("gebesis", 7000),
				new Car("avante", 1500),
				new Car("tesla", 5000),
				new Car("morning", 2500));
		// 가격순
		list.stream()
				.sorted()
				.forEach(n -> System.out.println(n));

		// 이름순
		list.stream()
				.sorted((a, b) -> a.getName().compareTo(b.getName()))
				.forEach(n -> System.out.println(n));

		// 가격의 역순
		list.stream()
				.sorted((a, b) -> b.getPrice() - a.getPrice()) // 거꾸로 빼는 걸로 재정의해주면 된다
				.forEach(n -> System.out.println(n));

		// 역순을 나타내는 메소드가 있음 reverseOrder()
		list.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(n -> System.out.println());
	}
}

class Car implements Comparable<Car> {
	private String name;
	private int price;

	public Car(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return name + price;
	}

	@Override
	public int compareTo(Car o) {
		return this.price - o.price;
	}
}
