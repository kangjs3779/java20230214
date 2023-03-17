package ch17.lecture.p02terminal;

import java.util.*;

public class C13Collect {
	public static void main(String[] args) {
		List<Integer> list = List.of(3, 2, 3, 2, 2, 2);

		Map<Integer, Integer> r1 = list.stream()
				.collect(HashMap::new, 
						(map, e) -> map.compute(e,(k,v) -> v == null ? 1 : v + 1),
						Map::putAll); //여러개의 hashmap을 어떻게 합칠 것인가??에대한 식이다
		//1파라미터랑 원소랑해서 2파라미터에 들어가고
		//1파라미터랑 원서랑 해서 3파라미터에 들어가고 
		
		//많이 안쓰니까 그렇구나하면 됨
	}
}
