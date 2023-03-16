package ch15.sec05.exam01;

import java.util.*;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		//나무모양으로 저장이 된다
		
		
		for(Integer s : scores) {
			System.out.print(s + " ");
		}
		
		System.out.println("\n");
		
		System.out.println("가장 낮은 점수 : " + scores.first());
		System.out.println("가장 높은 점수 : " + scores.last());
		System.out.println("95점 아래 점수 : " + scores.lower(95));
		System.out.println("95점 위의 점수 : " + scores.higher(95)); //포함안하고 바로 큰 것
		System.out.println("95점이거나 바로 아래 점수 : " + scores.floor(95)); //포함하고 작은 것
		System.out.println("85점이거나 바로 위의 점수 : " + scores.ceiling(85) + "\n");
		
		NavigableSet<Integer> descendingScores = scores.descendingSet(); //거꾸로 순서를 매김
		for(Integer s : descendingScores) {
			System.out.print(s + " ");
		}
		System.out.println("\n");
		
		NavigableSet<Integer> rangeSet = scores.tailSet(80, true); //80을 기준으로 큰 것들을 모은 set
		//두번째 파라미터는 첫파라미터를 포함할건지 말건지
		for(Integer s : rangeSet) {
			System.out.print(s + " ");
		}
		
		rangeSet = scores.subSet(80, true, 90, false); 
		for(Integer s : rangeSet) {
			System.out.println(s + " ");
		}
	}
}
