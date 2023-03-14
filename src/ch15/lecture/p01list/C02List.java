package ch15.lecture.p01list;

import java.util.*;

public class C02List {
	public static void main(String[] args) {
		//list 전체 탐색
		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("css");
		list.add("html");
		list.add("spring");
		list.add("react");
		list.add(5);
		
		//for
		System.out.println("------------------for-------------");
		for(int a = 0; a < list.size(); a++) {
			System.out.println(list.get(a));
		}
		
		
		//enhanced for
		System.out.println("----------enhanced for------------");
		for(String e : list) {
			System.out.println(e);
		}
		
		//Iterator
		System.out.println("-------------------iterator");
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		//list랑은 별로 궁합이 안좋음
		
		
		//list가 가지고 있는 아이템을 건네준다, super = out
		//forEach
		//consumer
		System.out.println("-----------------foreach----------");
		list.forEach(e -> System.out.println(e));
		//e와 e가 일치함
		//더 줄여 쓸 수 있따
		
		//forEach메소드
		list.forEach(System.out::println);
		
	
	
	}
}
