package ch13.review;

public class review07 {
	public static void main(String[] args) {
		ReviewClass07<? extends Number> o1 = new ReviewClass07<Number>();
		
		ReviewClass07<? extends Number> o2 = new ReviewClass07<Integer>();
		
		Number n1 = o2.item;
		Object o4 = o1.item;
		Integer i1 = o2.item;
		
		Integer i1 = o1.item;
		
		
		
	}
}

class ReviewClass07 <T> {
	public T item;
}
