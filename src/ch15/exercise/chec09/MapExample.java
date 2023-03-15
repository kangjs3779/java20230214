package ch15.exercise.chec09;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		//평균점수
		int score = 0;
		int count = 0;
		
		Set<String> keys = map.keySet();
		for(String key : keys) {
			score = map.get(key);
			if(maxScore < score) {
				maxScore = score;
				name = key;
			}
			totalScore += score;
			count++;
		}
		
		totalScore = totalScore / count;
		System.out.println(totalScore); //평균점수
		System.out.println(maxScore); //최고 점수
		System.out.println(name); //최고 점수 아이디
		
		
		
	}
}
