package ch15.lecture.p03set;

import java.util.*;

public class C02Iterator {
	public static void main(String[] args) {
		//iterator
		//collection 탐색을 위한 객체의 타입
		//hasNext : 다음 탐색할 원소가 있는지?
		//next : 다음 원소 리턴
		
		Set<String> set = new HashSet<>();
		set.add("java");
		set.add("css");
		set.add("spring");
		set.add("jsp");
		set.add("html");
		
		//remove : 특정 원소 지우기
		//만약 홀수길이를 가지고 있는 element를 지우고 싶다
		//조건에 따른 원소 지우기
		
		
		//enhanced for문 사용시 set이 변경되면 exception발생
		for (String e : set) {
			if (e.length() % 2 == 0) {
				set.remove(e);
			}
		}
		System.out.println(set.iterator());
		//따라서 지우는 목적으로 탐색한다면 interator.remove
		Iterator<String> iter = set.iterator();
		//Interator는 인터페이스 String클래스 타입으로 되어 있음
		//iterator()는 set인터페이스 안에있는 메소드임
		//Iterator(인터페이스)타입의 iterator라는 메소드임
		//리턴값으로 set에 있는 
		while (iter.hasNext()) {
			String n = iter.next();
			
			if((n.length() % 2) == 0) {
				iter.remove();
			}
		}
		
		System.out.println(set);
	}
}
