package ch15.lecture.p03set;

import java.util.*;

public class C03RemoveIf {
	public static void main(String[] args) {
		//iterator가 너무 기니까 대신 이걸 써도 된다
		Set<String> set = new HashSet<>();
		set.add("java");
		set.add("css");
		set.add("spring");
		set.add("jsp");
		set.add("html");
		
		set.removeIf(e -> (e.length() % 2) == 0);
		
		System.out.println(set);
		
		//간결하고 읽기쉬운 코드가 되었다
		
	}
}
