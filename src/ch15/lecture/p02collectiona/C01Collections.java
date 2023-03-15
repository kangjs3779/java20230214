package ch15.lecture.p02collectiona;

import java.util.*;

public class C01Collections {
	public static void main(String[] args) {
		List<String> list1 = List.of("java", "css", "spring", "jsp", "html");
		//of로 만든 리스는 수정할 수 없는 리스트이다
		//sort메소드 사용할 수 없음 - 수정할 수 없으니까
		
		List<String> list2 = new ArrayList<>(list1);
		//수정 가능 리스트로 다시 만듦
		
		
		
		//sort(정렬)
		Collections.sort(list2);
		System.out.println(list2);
		
		//max메소드 최대값 구하기
		String maxStr = Collections.max(list1);
		System.out.println(maxStr);
		
		//min메소드 최소값 구하기
		String minStr = Collections.min(list1);
		System.out.println(minStr);
		
		
		//reverse 거꾸로 바꿔줌
		Collections.reverse(list2);
		System.out.println(list2);
		
		// fill - 원소들을 특정값으로 모두 바꿔준다
		Collections.fill(list2, "web");
		System.out.println(list2);
	}
}
