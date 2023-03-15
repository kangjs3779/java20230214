package ch15.review;

import java.util.*;

public class review06 {
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		//integer클래스 타입으로 된 set인터페이스 타입의 set변수
		//hashSet을 통해서 객체를 만듬
		
		//add element
		set.add(30);
		set.add(80);
		set.add(3);
		set.add(7);
		set.add(90);
		
		//원소는 총 4개
		//중복되는 건 안되니까
		
		//전체 탐색
//		for(int a : set) {
//			System.out.println(a);
//		}
//		
//		for(int a : set) {
//			if((a % 3 ) == 0) {
//				set.remove(a);
//			}
//		}
		
		
		//전체 탐색
//		Iterator<Integer> iter = set.iterator();
//		while(iter.hasNext()) {
//			int a = iter.next();
//			
//			if((a % 3) ==0) {
//				iter.remove();
//			}
//		}
//		System.out.println(set);
		
		
		
		set.removeIf((Integer a) -> (a % 3) == 0);
		System.out.println(set);
	}
}










