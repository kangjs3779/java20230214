	package ch15.lecture.p04map;

import java.util.*;

public class C04Map {
	public static void main(String[] args) {
		//map
		//(key, value) 쌍 entry를 저장
		//key는 중복되지 않음
		
		Map<String, String> map = new HashMap<>();
		
		//entry 추가 두개의 파라미터를 받음
		map.put("kang", "slamdunk");
		map.put("serly", "navatar");
		map.put("maverick", "topgun");
		
		//entry 개수
		int size = map.size();
		System.out.println(size);
		
		map.put("kang", "baseball");
		//키는 중복 불가 마지막에 들어간 밸류가 대체된다
		//변경
	
		
		System.out.println(map.size());
		
		//key로 value얻기
		String v1 = map.get("serly");
		System.out.println(v1);
		
		//entry 지우기
		map.remove("kang");
		System.out.println(map.size());
		
		//전체탐색
		//키는 셋의 특징과 비슷함
		
		System.out.println("keyset 사용");
		Set<String> keys = map.keySet(); //키 set 얻기
		for (String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
		
		System.out.println("foreach method~~~~~~~~~~~~~");
		map.forEach((k, v) -> System.out.println(k + ":" + v));
		//hover를하면 타입을 볼 수 있다
		
		//각엔트리를 set으로 바꿔줌
		System.out.println("entrySet 메소드~~~~~~");
		Set<Map.Entry<String, String>> entries = map.entrySet();
		for (Map.Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		
		
		
		
	}
}
