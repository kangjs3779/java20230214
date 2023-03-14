package ch15.lecture.p01list;

import java.util.*;

public class C01List {
	//List
	//패키지는 java.util.List
	//순서가 있는 컬렉션
	//순서가 있어서 각 아이템(원소, element)들에 인덱스를 통해 접근할 수 있음
	//어떤 객체를 담고 있는 것 - 컬렉션
	
	public static void main(String[] args) {
		//새 리스트 만들기
		List<String> list = new ArrayList<String>();
//		List<String> list = new ArrayList<>();
//		var list = new ArrayList<String>();
		
		// element 추가
		list.add("java");
		list.add("css");
		list.add("spring");
		list.add("java");
		//순서대로 들어감
		
		
		//element 얻기
		String e1 = list.get(0);
		String e2 = list.get(1);
		String e3 = list.get(2);
		String e4 = list.get(3);
		//변수에 받아서 얻으면 된다
		
		
		//list 크기
		int size = list.size();
		
		//특정 index의 element 지우기
		//지운 후 오른쪽의 값이 왼쪽에 채워짐
		//그럼 index3은 없어짐
		list.remove(2);
		//2번인덱스에 있는 값은 사라짐
		System.out.println("지운 후 크기 : " + list.size());
		System.out.println("지운 후 2번 index의 값 : " + list.get(2));
			
		//특정 index의 값 바꾸기
		list.set(2, "react");
		
	}
	
}
