package ch17.lecture.p02terminal;

import java.util.*;
import java.util.stream.*;

public class C15Collect {
	public static void main(String[] args) {
		List<String> list = List.of("java", "css", "html", "jsp");

		// 같은 길이를 가진 String끼리 묶을 예정
		Map<Integer, List<String>> r1 = list.stream()
				.collect(Collectors.groupingBy(s -> s.length())); // 길이를 재서 길이값이 list에 넣어진다
		System.out.println(r1);
		
		//고전적인 방법을 사용해도 된다
		Map<Integer, List<String>> r2 = new HashMap<>();
		//map은 entry(쌍으로 값을 저장)타입으로 값을 저장한다 
		//인터페이스라서 이것을 구현하는 대표적인 클래스로 객체를 만들었다
		for(String s : list) {
			//반복문을 시작하는데 list에 있는 애들을 하나하나 복사해서 s에 넣을거다
			int key = s.length();
			//오토박싱이 되니까 Integer도 된다
			//하여튼 문자열의 길이를 재서 정수타입의 key값에 넣는다
			List<String> val = r2.get(key);
			//list인터페이스타입의 val에 value값을 뽑아서 넣는다
			if(val == null) {
				//만약에 value값이 null이면
				val = new ArrayList<>();
				//val에 새로운 list객체를 만들어 그 객체를 위한 참조값을 넣는다
				r2.put(key, val);
				//그리고 map타입의 r2에 entry값을 넣어준다
			} 
			val.add(s);
			//그리고나서 s를 val에 붙여준다
		}
		
		System.out.println(r2);
		
		//두개는 같은 결과를 도출해내는 코드이다
		//한번 해석을 해봐라
	}
}
