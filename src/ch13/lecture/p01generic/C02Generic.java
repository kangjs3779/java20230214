package ch13.lecture.p01generic;

import java.util.*;

public class C02Generic {
	public static void main(String[] args) {
		MyClass02<String> o1 = new MyClass02<String>();
		
		o1.setItem("java");
		String s1 = o1.getItem();
		System.out.println(s1.length());
		
		//클래스 파일에서 T가 String을 실행시키면
		MyClass02<Scanner> o2 = new MyClass02<Scanner>();
		//우리 눈에는 T지만 사실은 이렇게 선언하고 나서부터는 Scanner타입으로 모두 바뀐거나 다름 없다
		o2.setItem(new Scanner(""));
		Scanner sc = o2.getItem();
		System.out.println(sc.hasNext());
		
//		MyClass02<int> o3; //기본타입은 타입아규먼트로 사용불가
		MyClass02<Integer> o3 = new MyClass02<Integer>();
		o3.setItem(Integer.valueOf(3));
		o3.setItem(3);//auto boxing
		int i = o3.getItem(); //unboxing
		System.out.println(i);
	}
}

//< >이게 있는 타입을 뭐가 올지 모른다는 뜻에서 generic type : 포괄적인 타입
//<>T타입을 나중에 받겠다는 뜻
//T : type parameter
//type parameter 작명 관습 : 대문자 한글자 또는 숫자 (T1 T2 T3) 

class MyClass02<T> {
	private T item; //타입을 모르겠다는 뜻
	
	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}