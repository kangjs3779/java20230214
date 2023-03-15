package ch15.lecture.p03set;

import java.util.*;

public class C04Contains {
	public static void main(	String[] args) {
		Set<String> set = Set.of("java", "css", "html", "jsp");
		
		//contains : 해당 원소가 이미 있는지 없는지 확인
		//참조값을 비교하는게 아니라 참조가 가리키는 내용을 확인
		//boolean type
		System.out.println(set.contains("java"));
		System.out.println(set.contains("css"));
		System.out.println(set.contains("python"));
		System.out.println(set.contains(new String("java")));
		//인스턴스는 다름 그래도 트루나옴
	}
}
