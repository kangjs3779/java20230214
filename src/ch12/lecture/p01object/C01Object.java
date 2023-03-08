package ch12.lecture.p01object;

import java.util.*;

public class C01Object {
	//object
	//모든 클래스의 상위 클래스
	
	public static void main(String[] args) {
		String s1 = "java";
		Object o1 = s1;
		
		Scanner sc = new Scanner("");
		Object o2 = sc;
		
		ArrayList list = new ArrayList();
		Object o3 = list;
		
		C01Object o2 = new C01Object();
		Object o4 = o2;
		
		Object o5 = new MyClass01();
		
		int i = 3;
		//참조타입의 값을 기본타입에 넣을 수 없음
		//기본타입의 값을 참조타입에 넣을 수 있음
		//두개는 저장되는 방법이 다르기 때문에
		Object o7 = i;
		//참조타입에 기본 타입의 값을 넣는 건 가능
		//나중에 배움
		//심지어 기본타입도 Object이다
		
	}
}

class MyClass01 {
	//exends Object 생략 됨
}
