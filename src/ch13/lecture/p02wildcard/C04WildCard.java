package ch13.lecture.p02wildcard;

import java.util.*;

public class C04WildCard {
	public static void main(String[] args) {
		MyClass04<Number> o1 = new MyClass04<>();
		printItem(o1);
		
		MyClass04<Integer> o2 = new MyClass04<>();
		printItem(o2);
		
		MyClass04<Double> o3 = new MyClass04<>();
		printItem(o3);
	}
											//넘버로 딱 명시하면 문법 오류가 난다
	public static void printItem(MyClass04<? extends Number> param) {
		Number num = param.item;
		System.out.println(num.doubleValue() * num.doubleValue());
		//넘버로 읽는 것, 꺼내는 것 가능 함
		//오브젝트는 들어올 수 없으니까 읽을 수 없음
		
	}
}

class MyClass04<T> {
	private T item;
	
	public T getItem() {
		return item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
}
