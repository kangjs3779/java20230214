package ch15.exercise.leetcode;

import java.util.*;

public class Solution2206 {
	public boolean divideArray(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		
		// 각 값이 몇개인 세는 코드
		for (int n : nums) {
			//n이라는 변수에 nums배열의 원소들을 하나하나 넣어 볼거야
			if (map.containsKey(n)) {
				// 키 n의 값을 1 더해서 다시 entry에 넣는다.
				//만약에
				//map의 값 중에서 key값에 n이 있으면
				int oldvalue = map.get(n);
				//oldvalue라는 정수타입 변수에
				//map에서 get메소드에 접근해서
				//n이라는 key를 입력해서 value를 뽑아줄거야
				//그 value를 변수에 넣어줄 거야
				map.put(n, oldvalue + 1);
				//그리고 맵에 원소를 더해줄거야
				//n숫자랑 oldvalue에 일을 더한 값을 넣어줄거야
				
			} else {
				//만약에
				//map의 값 중에서 key값에 n이 없으면
				map.put(n, 1);
				//map에 n을 넣고 1이라고 넣어줄거야
			}
			
		}
		
		
		// value가 홀수 인게 있으면 return false;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int v = entry.getValue();
			if (v % 2 == 1) {
				return false;
			}
		}
		
		
		return true;
	}
}
