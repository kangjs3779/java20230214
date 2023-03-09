package ch12.lecture.p01object;

import java.util.*;

import ch08.sec10.exam01.*;

public class C24HashCodeEquals {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		set.add(new MyClass24(1, "kim"));
		set.add(new MyClass24(2, "edaman"));
		set.add(new MyClass24(1, "kim"));
		
		System.out.println(set.size());
		//처음과 마지막은 새로운 객체를 생성했기 때문에 다른 애들이라고 판단함 - 3
		//hashcode와 equals를 재정의함
		//같은 아이디를 가진애들은 같은애라고 함
		//그래서 사이즈가 2가 나옴
		
	}
}

class MyClass24 {
	private int id;
	private String name;
	
	public MyClass24(int id, String name) {
		this.id = id;
		this.name = name;
	}
	//생성자 정의함

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyClass24 other = (MyClass24) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
	
}
