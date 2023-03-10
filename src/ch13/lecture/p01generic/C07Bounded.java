package ch13.lecture.p01generic;

import java.util.*;

public class C07Bounded {
	public static void main(String[] args) {
		MyClass07 <String>  o1 = new MyClass07();
		o1.setItem("java");
		o1.printItem();
		
		MyClass07<Scanner> o2 = new MyClass07<>();
		o2.setItem(new Scanner(""));
		
	}
}

class MyClass07 <T> {
	private T item;
	//필드 선언
	
	
	//메소드 선언
	public void printItem() {
		//Object의 메소드 안전하게 실행 가능
		//왜냐하면 Object는 모든 클래스의 상위 클래스 이니까
		String str = item.toString();
		//T 변수타입 item안에 있는 값을 문자열로 그대로 뽑아라
		int hashCode = item.hashCode();
		//T 변수타입 item안에 있는 값을 해시코드로 뽑아라
		boolean equals = item.equals(null);
		//T 변수타입 item안에 있는 값이 null과 같은지 뽑아라
		
		System.out.println(str + hashCode + equals);
	}
	
	public T getItem() {
		return item;
		//T타입의 메소드를 선언하는데 이건 값을 읽을 목적으로 메소드인 getter이다
	}
	
	public void setItem(T item) {
		this.item = item;
		//void 타입의 메소드를 선언하는데 이건 값을 파라미터로 받아서 사용할 목적인 setter이다
	}
	

}

//Number라는 클래스는 기본타입 클래스의 상위 클래스이다
//Number 타입으로 제한하면 이 클래스 안에 있는 메소드는 안전하게 실행 가능함
