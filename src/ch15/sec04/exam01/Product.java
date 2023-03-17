package ch15.sec04.exam01;

import ch15.lecture.p07treeSet.StringBuilder;

public class Product {
	private int pno;
	private String name;
	private String company;
	private int price;
	//외부에서 접근할 수 없도록 private접근제한자를 사용해서 field선언
	
	public Product(int pno, String name, String company, int price) {
		super();
		this.pno = pno;
		this.name = name;
		this.company = company;
		this.price = price;
	}
	//생성자를 다시 선언함
	//기본생성자는 이제 자동삽입이 되지 않음
	
	public int getPno() {
		return pno;
	}
	//pno값을 읽기위한 메소드 getter
	
	
	public String getName() {
		return name;
	}
	//name값을 읽기 위한 메소드 getter
	
	
	public String getCompany() {
		return company;
	}
	//company값을 읽기위한 메소드 getter
	
	
	public int getPrice() {
		return price;
	}
	//price값을 읽기 위한 메소드 getter
	
	@Override
	public String toString() {
		return new StringBuilder()
				.append("{")
				.append("pno:" + pno + ", ")
				.append("name:" + name + ", ")
				.append("company:" + company + ", ")
				.append("price:" + price )
				.append("}")
				.toString();
	}
	//재정의한 toString
		
}
