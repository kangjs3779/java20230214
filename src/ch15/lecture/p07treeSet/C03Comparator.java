package ch15.lecture.p07treeSet;

import java.util.*;

public class C03Comparator {
	public static void main(String[] args) {
		TreeSet<Book> set = new TreeSet<>((b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));
		set.add(new Book("slamdunk"));
		set.add(new Book("avatar"));
		set.add(new Book("glory"));
		
		//내가 만든 Book은 comparable을 구현하지 않았음
		//그래서 comparator를 지정해줘야 한다
		
		
		System.out.println(set);
		//선생님 코드비교
	}
}


//getter / setter  constructor, toString
class Book {
	//field
	private String title;
	
	//constructor
	public Book(String tile) {
		this.title = title;
	}
	
	//getter setter
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	//toString override
	@Override
	public String toString() {
		return title;
	}


	//hashCode, equals
	@Override
	public int hashCode() {
		return Objects.hash(title);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(title, other.title);
	}
	
	
	
}