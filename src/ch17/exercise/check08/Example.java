package ch17.exercise.check08;

import java.util.*;
import java.util.stream.*;

public class Example {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자")
				);
		
		//고전적인 방법
		System.out.println("[개발자]");
		for(int a = 0; a < list.size(); a++) {
			Member o1 = list.get(a);
			
			if(o1.getJob().equals("개발자")) {
				System.out.println(o1);
			}
		}
		System.out.println();
		
		System.out.println("[디자이너]");
		for(int a = 0; a < list.size(); a++) {
			Member o1 = list.get(a);
			
			if(o1.getJob().equals("디자이너")) {
				System.out.println(o1);
			}
		}
		
		//스트림방법
		Map<String, List<Member>> map = list.stream()
				.collect(Collectors.groupingBy(Member::getJob));
		
		System.out.println("[개발자]");
		map.get("개발자").stream().forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("[디자이너]");
		map.get("디자이너").stream().forEach(System.out::println);
		
		
		///코드 선생님꺼 재확인
	}
}
