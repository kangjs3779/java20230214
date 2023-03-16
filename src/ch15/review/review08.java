package ch15.review;

import java.util.*;

public class review08 {
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		//원소 넣기
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		//원소의 개수 알아보기(int)
		System.out.println("원소의 개수 : " + stack.size());
		
		//stack이 비어있는지 확인함(boolean)
		System.out.println("비어있나? " + stack.empty());
		
		//마지막에 들어간 원소부터 꺼내고 지운다
		System.out.println("마지막에 들어간 원소 : " + stack.pop());
		System.out.println("그 원소 지워지고 사이즈 : " + stack.size());
		//원소가 하나 지워져서 사이즈가 줄었다
		
		//마지막에 들어간 원소를 확인만하고 지우진 않음
		System.out.println("마지막원소 확인만 함 : " + stack.peek());
		System.out.println("사이즈 안줄어듦 : " + stack.size());
		//사이즈 변함이 없는 것을 알 수 있다
		
		
		
		
		
		
		
	}
}
