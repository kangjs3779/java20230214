package ch15.lecture.p06stack;

import java.util.*;

public class C01Stack {
	public static void main(String[] args) {
		//LIFO(last in first out). 후입선출, stack
		//주요 메소드
		//push : 새 아이템 추가
		//pop : 아이템 꺼내면서 삭제
		
		//얘는 concrete class이다
		Stack<String> stack = new Stack<>();
		
		stack.push("backho");
		stack.push("chisoo");
		stack.push("taesup");
		stack.push("feaman");
		stack.push("taewoong");
		
		System.out.println(stack.size());
		System.out.println(stack.equals("feaman"));
		
		String s1 = stack.pop(); //가장 마지막에 들어간 애가 나오면서 삭제된다
		System.out.println(s1);
		
		while (stack.size() > 0) {
			System.out.println(stack.pop());
		}
		
		System.out.println(stack.size());
		
	}
}
