package ch15.review;

import java.util.*;
import java.util.function.*;


public class review01 {
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<>();
		
		//element 추가
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("a");
		
		
		for(int a = 0; a < list1.size(); a++) {
			System.out.print(list1.get(a));
		}
		
		System.out.println();
		
		for(String a : list1) {
			System.out.print(a);
		}
		
		
		list1.forEach(e -> System.out.println(e));
		
		
		list1.forEach(System.out::println);
		
		list1.forEach((String e) -> System.out.println(e));
		
		
	}
}

