package ch15.lecture.p07treeSet;

import java.util.*;

public class C01TreeSet {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		Set<Integer> treeSet = new TreeSet<>();
		
		set.add(3000);
		treeSet.add(3000);
		set.add(20);
		treeSet.add(20);
		set.add(20000);
		treeSet.add(20000);
		
		set.add(20);
		treeSet.add(20);
		//중복 저장은 안된다
		
		System.out.println(set); //순서가 없다
		System.out.println(treeSet); //트리구조로 아이템을 오른쪽, 왼쪽에 기준을 두고 정렬한다(순서가 있음)
		
		
	}
}
