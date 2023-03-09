package ch12.review;

public class review03 {
	public static void main(String[] args) {
		Object me = new Book(10);
		Object other = new Book(10);
		
		System.out.println(me.hashCode());
		System.out.println(other.hashCode());
		
		System.out.println(me.equals(other));
		
	}
}

class Book {
	private int id;
	
	Book(int id) {
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Book book) {
			return true;
		}
		return false;
	}
}