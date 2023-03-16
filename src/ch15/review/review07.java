package ch15.review;

import java.util.*;
import java.util.Map.*;

public class review07 {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		
		//Map에 원소를 더하는 메소드 : put()
		map.put("e", 7);
		map.put("q", 8);
		map.put("a", 5);
		map.put("x", 5); //value가 같은건 가능
		map.put("x", 2); //key가 같은건 불가능
		
			
		//안에 원소가 몇개있는지 알려줌
		System.out.println(map.size());
		System.out.println();
		
		//이런 키값이 있는가?(boolean타입)
		System.out.println(map.containsKey("a"));
		System.out.println(map.containsKey("h"));
		
		//이런 밸류값이 있는가?(boolean타입)
		System.out.println(map.containsValue(5));
		System.out.println(map.containsValue(10));
		
		System.out.println();
		
//		Set<Map<String, Integer>> set1 = map.entrySet();
		
		//map에 있는 entry값(key + value)을 리턴하는 메소드
		map.entrySet();
		
		//출력하고싶으면 바로 출력코드로 출력하거나
		
		System.out.println(map.entrySet());
		
		//Set인터페이스 타입에 넣에서 출력하거나
		Set<Entry<String, Integer>> set = map.entrySet();
		System.out.println(set);
		
		System.out.println("-----------");
		//map에있는 value를 collection에 담아서 리턴
		
		System.out.println(map.values());
		
		Collection<Integer> a = map.values();
		System.out.println(a);
		System.out.println("!!!!!!!!!!!!!!!!!");
		System.out.println(map.keySet());
		
		Set<String> a1 = map.keySet();
		System.out.println(a1);
		
		System.out.println();
		
		//key값으로 value를 얻는 get()메소드
		System.out.println(map.get("e"));
		System.out.println(map.get("a"));
		System.out.println(map.get("k")); //없는 키라서 null이 나옴
		System.out.println();
		
		//map이 비어있는지 물어보는 메소드(boolean)
		System.out.println(map.isEmpty()); //안에 원소가 있어서 false가 나온다
		map.clear(); //map의 원소를 모두 지우는 메소드
		System.out.println(map.isEmpty()); //모두 지워서 true가 나온다
		
		System.out.println();
		map.put("a", 5);
		map.put("e", 7);
		map.put("q", 8);
		map.put("x", 4);
		System.out.println();
		
		System.out.println("---");
		System.out.println(map.keySet());
		Set<String> setKey = map.keySet();
		System.out.println(setKey);
		
		System.out.println(map.values());
		Collection<Integer> val = map.values();
		System.out.println(val);
		
		System.out.println(map.remove("e"));
		
		
		
		
		
	}
}
