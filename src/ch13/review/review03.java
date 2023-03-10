package ch13.review;

public class review03 {
	public static void main(String[] args) {
		Box box = new Box();
		Object o1 = box.content;
		System.out.println(o1);
		
		int i1 = 5;
		o1 = i1;
		int i2 = (int) o1;
		
		System.out.println(i1 + i2);	
		
	}
}


class Box {
	public Object content;
	
}