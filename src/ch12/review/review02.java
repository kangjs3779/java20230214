package ch12.review;

public class review02 {
	public static void main(String[] args) {
		MyClass02 o1 = new MyClass02();
		MyClass02 o2 = new MyClass02();
		
		
		
		System.out.println(o1.toString());
		System.out.println(o2.toString());
		
	}
}

class MyClass02 {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "쨘";
	}
}