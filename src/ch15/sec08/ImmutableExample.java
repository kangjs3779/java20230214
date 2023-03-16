package ch15.sec08;

import java.util.*;

public class ImmutableExample {
	public static void main(String[] args) {
		List<String> immutableList1 = List.of("A", "B", "c");
		
		Set<String> immutableSet1 = Set.of("A", "B", "C");
		
		Map<Integer, String> immutableMap1 = Map.of(1, "A", 2, "B", 3, "C");
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		List<String> immutableList2 = List.copyOf(list);
		
		//수정 가능한 리스트로 만들기
		Set<String> set1 = new HashSet<>(immutableList2);
		set1.add("E");
		
		
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		Set<String> immutableSet2 = Set.copyOf(set);
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		Map<Integer, String> immutableMap2 = Map.copyOf(map);
		//수정가능한 맵 만들기
		Map<Integer, String> map2 = new HashMap<>(immutableMap2);
		map2.put(4, "D");
		System.out.println(map2);
		
		
		String[] arr = { "A", "B", "C" };
		List<String> immutableList3 = Arrays.asList(arr); //수정이 불가능하다기보다는 사이즈가 고정되어 있다
		//add나 remove같은 사이즈를 변경시키는 것은 exception을 발생시키고 값을 변경하는 것은 괜찮다
		//그냥 API보면서 이해 잘 하면 된다
		
		int[] arr2 = {3, 4, 5};
		List<Integer> list4 = Arrays.asList(arr2);
		//int가 Integer로 자동으로 되진 않는 것 같다
		
	}
}
