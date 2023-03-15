package ch15.lecture.p02collectiona;

import java.util.*;

public class C04Compare {
	public static void main(String[] args) {
		var list = new ArrayList<Person04>();
		list.add(new Person04("kang", "20230315"));
		list.add(new Person04("seo", "20221203"));
		list.add(new Person04("chae", "20020605"));
		list.add(new Person04("song", "20121203"));
		list.add(new Person04("jung", "20210707"));

		//나이순 정렬(나이가 어릴수록 작은 index)
		
		
		//선생님 코드 해석 해보기
		//코드 해석하기전에 내가 한번 해보기
		// 나이순 정렬(나이가 어릴수록 작은 index에)
		Collections.sort(list);
		//Comparable 인터페이스를 구현하지 않아서 comparator를 지정해줘야 한다
		
		Collections.sort(list, (a, b) -> b.getBirth().compareTo(a.getBirth()));
		//compartor를 지정해줌 
		//functional interface라서 람다식으로 재정의 가능
		
		//두번째 파라미터 풀어서쓰기
		(Person04 a, Person04) -> b.getBitrh().compareTo(a.getBirth()));
		//더 풀어서 쓰기
		Comparator o1 = new Comparator {
			@Override
			
		}
		
		System.out.println(list);
		
		
		
		
	}
}

class Person04 {
	private String name;
	private String birth;
	
	//constructor
	public Person04(String name, String birth) {
		super();
		this.name = name;
		this.birth = birth;
	}
	
	//getter setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBirth() {
		return birth;
	}
	
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	//toString
	@Override
	public String toString() {
		return "이름 : " + name + "생일 : " + birth;
	}
	
	
}
