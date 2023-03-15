package ch15.lecture.p03set;

import java.util.*;

public class C05Contains {
	public static void main(String[] args) {
		//objects는 object랑 다르다
		var set = new HashSet<Book>();
		set.add(new Book("슬램텅크"));
		set.add(new Book("아바타"));
		set.add(new Book("탑건"));
		set.add(new Book("슬램덩크")); //안들어감 중복이라서
		
		System.out.println(set.size());
		System.out.println(set.contains(new Book("아바타")));
		//왜 false일까??
		//처음에는 true가 나왔고
		//소스에서 해쉬코드랑 이퀄즈 쓰니까 true나옴 왜일까??
		
	}
}


class Book {
	private String title;

	public Book(String title) {
		super();
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return title;
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(title);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Book other = (Book) obj;
//		return Objects.equals(title, other.title);
//	}
	
	
	
}