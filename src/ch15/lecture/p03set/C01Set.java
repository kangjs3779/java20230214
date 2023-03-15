package ch15.lecture.p03set;

import java.util.*;

public class C01Set {
	public static void main(String[] args) {
		// set : 순서없음, 중복 안됨
		Set<Integer> set = new HashSet<>();
		
		//add element
		set.add(30);
		set.add(90);
		set.add(3);
		set.add(7);
		set.add(90);
		
		//size
		int size = set.size();
		System.out.println(size);
		//중복 저장이 안되니까 5개를 넣어도 중복되는 하나는 제외하고 4개임
		
		//remove
		set.remove(3);
		System.out.println(set.size());
		System.out.println(set); //toString override 되어 있음
		//순서가 없음을 확인할 수 있다
		
		//전체 탐색하는 방법
		System.out.println("향상된 for문");
		
		for(int a : set) {
			System.out.println(a);
		}
		
		//인덱스가 없어서 원래의 for문은 사용할 수 없음
		
		//Iterator
		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		//forEach문
		set.forEach(e -> System.out.println(e));
		set.forEach(System.out::println);
		
	}
}


