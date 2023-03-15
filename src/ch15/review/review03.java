package ch15.review;

import java.util.*;

public class review03 {
	public static void main(String[] args) {
		List<Person03> list1 = new ArrayList<>();
		//이건 Person03타입의 list1을 만들었다는 뜻
		System.out.println(list1.size());
		
		List<Person03> list2 = new ArrayList<>(3);
		//이건 모르겠음
		list2.add(new Person03());
		list2.add(new Person03());
		list2.add(new Person03());
		list2.add(new Person03());
		System.out.println(list2.size());
		
		
		List<Person03> list3 = new ArrayList<>(list2);
		//Constructs a list containing the elements of the specified collection
		//콜렉션 타입의 변수에 담긴 원소를 가지고 있는 리스트를 생성한다
		//원소를 다 복사함
	}
	
}

class Person03 {
	
}