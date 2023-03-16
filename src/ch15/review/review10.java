package ch15.review;

import java.util.*;

public class review10 {
	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<>();
		
		//원소 더하기
		tree.add(46);
		tree.add(80);
		tree.add(23);
		tree.add(41);
		tree.add(95);
		
		//원소개수 구하기
		System.out.println(tree.size());
		//제일 낮은 객체 - 제일 왼쪽
		System.out.println(tree.first());
		//제일 높은 객체 - 제일 오른쪽
		System.out.println(tree.last());
		//주어진 객체와 파라미터가 동일하면 출력
		//없으면 파라미터 바로 아래 객체 출력
		System.out.println(tree.floor(45));
		//주어진 객체와 파라미터가 동일하면 출력
		//없으면 파라미터 바로 위 객체 출력
		System.out.println(tree.ceiling(45));
		//제일 낮은 객체 꺼내서 삭제
		System.out.println(tree.pollFirst());
		//제일 높은 객체 꺼내서 삭제
		System.out.println(tree.pollLast());
		
//		Iterator<Integer> iter = tree.descendingIterator();
//		System.out.println(iter);
		//???? 왜 참조값이 나오지??
		
		//거꾸로 정렬된 객체들을 모두 출력
		NavigableSet<Integer> navi = tree.descendingSet();
		System.out.println(navi);
		
		
		
	}
}
