package ch15.lecture.p02collectiona;

import java.util.*;

public class C03Compare {
	public static void main(String[] args) {
		List<Person03> list = new ArrayList<>();
		list.add(new Person03("cha", 50));
		list.add(new Person03("son", 30));
		list.add(new Person03("park", 30));
		
		System.out.println(list); //내가 넣은대로 들어가 있음
	}
}

class Person03 implements Comparable<Person03> { //인터페이스 구현하면 인터페이스안에있는 추상메소드 재정의 필요
	//field
	private String name;
	private int age;
	
	//constructor
	public Person03(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//getter, setter
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//toString
	@Override
	public String toString() {
		return name + age;
	}
	
	//인터페이스 안에 있는 추상메소드
	@Override
	public int compareTo(Person03 o) {
		
//		return this.age - o.age;
		//나이순 정렬
		
//		return this.name.compareTo(o.name);
		//이름순 정렬
		
		int ageDiff = this.age - o.age;
		
		if(ageDiff == 0) {
			return this.name.compareTo(o.name);
		}
		
		return ageDiff;
		//나이순으로 하고 나이가 같으면 그다음 이름순
		
	}
}
