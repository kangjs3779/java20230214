package ch15.lecture.p01list;

import java.util.*;

public class C03List {
	public static void main(String[] args) {
		//list의 list
		List<String> list1 = new ArrayList<>();
		list1.add("java");
		list1.add("spring");
		
		List<List<String>> list2 = new ArrayList<>();
		var list3 = new ArrayList<List<String>>();
		
		list2.add(new ArrayList<>());
		list2.add(new ArrayList<>());
		
		System.out.println(list2.get(0).size());
		System.out.println(list2.get(1).size());
		
		list2.get(0).add("java1");
		list2.get(0).add("java2");

		list2.get(1).add("java1");
		list2.get(1).add("java2");
		list2.get(1).add("java3");
		list2.get(1).add("java4");
		
		//전체탐색
		//for
		System.out.println("for----------------");
		for(int i = 0; i < list2.size(); i++) {
			for(int j = 0; j < list2.get(i).size(); j++) {
				System.out.println(list2.get(i).get(j));
			}
		}
		
		
		//향상된 for
		System.out.println("enhanced for-=-------");
		for(List<String> list : list2) {
			for(String item : list) {
				System.out.println(item);
			}
		}
		
		
		
		//foreach
		System.out.println("-----------foreach");
		list2.forEach(list -> list.forEach(e -> System.out.println(e)));
		
		
		//foreach
		System.out.println("-----------foreach");
		list2.forEach(list -> list.forEach(System.out::println));
		//
		
		
		
	}
}
