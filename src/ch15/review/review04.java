package ch15.review;

import java.util.*;

public class review04 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		int max = Collections.max(list);
//		System.out.println(max);
//		System.out.println(list);
		
		//------------------------------------------------------------------
		
		List<String> list2 = new ArrayList<>();
		list2.add("kang");
		list2.add("park");
		list2.add("choi");
		
		
//		System.out.println(list2.add(5));
		String maxstr = Collections.max(list2);
		System.out.println(maxstr); 		
		
		//-------------------------------------------------------------------
		
		List<Person04> list1 = new ArrayList<>();
		
		list1.add(new Person04("kang"));
		list1.add(new Person04("park"));
		list1.add(new Person04("choi"));
		
//		Collections.max(list1);
		//comparator나 comparable 둘 중 하나는 해야 비교가 가능하다
		//comparator는 주로 파라미터로 들어가서 람다식으로 표현이 되고
		//함수형 인터페이스라서
		
		//comparable은 인터페이스 구현으로 주로 들어간다
		//함수형인터페이스 아님
	}
}

class Person04 {
	private String name;
	
	public Person04(String name) {
		this.name = name;
	}
}




interface Comparable<T> {
	public int compareTo(T o);
}

@FunctionalInterface
interface Comparator<T> {
	public int compare(T o1, T o2);
}









