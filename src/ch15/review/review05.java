package ch15.review;

import java.util.*;

public class review05 {
	public static void main(String[] args) {
		List<Person03> list = new ArrayList<>();
		list.add(new Person03("cha", 50));
		list.add(new Person03("son", 30));
		list.add(new Person03("park", 30));
	}
}

class Person03 implements Comparable<Person03> {
	//필드 선언
	private String name;
	private int age;
	
	
	//생성자 선언
	public Person03(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	//값을 읽기위한 getter
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	//값의 수정을 위한 setter
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//이 클래스를 출력하면 바로 원소들이 나왔으면 좋겠음
	@Override
	public String toString() {
		return name + " : " + age;
	}
	
	//Comparable인터페이스 안에 있는 추상페소드 재정의
	@Override
	public int compareTo(Person03 o) {
		//나이순으로 정렬
//		return this.age - o.age;
		
		//이름순으로 정렬
//		return this.name.compareTo(o.name);
		
		//나이순 -> 이름순
		int ageDiff = this.age - o.age;
		
		if(ageDiff == 0) {
			return this.name.compareTo(o.name);
		}
		
		return ageDiff;
	}
}