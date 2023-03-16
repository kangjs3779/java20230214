package ch15.exercise.leetcode;

import java.util.*;

public class Solution1748 {
	public int sumOfUnique(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		
		//탐색을 함
		for(int a : nums) {
			
			if(map.containsKey(a)) {
				//map에 a가 들어가 있으면
				int oldValue = map.get(a);
				map.put(a, oldValue + 1);
				
			} else {
				//map에 a가 없으면
				map.put(a, 0);
			}
		}
		//밸류값이 0이면 키값이 한개, 1이상이면 키값이 두개이상
		int sum = 0;
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int value = entry.getValue();
			
			if(value == 1) {
				sum += entry.getKey();
			}
		}
		
		
		return sum;
	}
}
