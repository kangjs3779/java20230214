package ch12.review;

public class review01 {
	public static void main(String[] args) {
		Class01 c1 = new Class01();
		Object o1 = c1;
		Class01 c2 = o1;
	}
}

class Class01 {}
//부모클래스를 따로 선언하지 않음
