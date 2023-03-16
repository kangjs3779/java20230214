package ch15.review;

import java.util.*;

public class review09 {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		
		//원소 더하기
		queue.offer(100);
		queue.offer(200);
		queue.offer(300);
		queue.offer(400);
		queue.offer(500);

		//원소꺼내고 삭제함
		System.out.println(queue.poll());
		//선입선출 - 처음 들어간 원소가 나오고 삭제
		System.out.println(queue.size());
		//삭제되어서 사이즈 5 -> 4
		
		System.out.println(queue.peek());
		//먼저 들어간 원소 확인만하고 삭제하지 않음
		System.out.println(queue.size());
		//삭제 안되어서 사이즈 4 -> 4
	}
}
