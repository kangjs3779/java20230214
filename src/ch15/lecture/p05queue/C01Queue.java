package ch15.lecture.p05queue;

import java.util.*;

public class C01Queue {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		
		//offer : 새로운 아이템 삽입
		queue.offer("kang");
		//poll : 기존 아이템 삭제(꺼내기)
		String s1 = queue.poll();
		
		System.out.println(queue.size()); //하나 넣고 하나 꺼냈으니 0
		System.out.println(s1); //꺼낸건 넣었던 kang
		
		System.out.println();
		
		queue.offer("chae");
		queue.offer("song");
		queue.offer("jeong");
		queue.offer("seo");
		System.out.println(queue.size()); //4개넣었으니 4
		System.out.println(queue.poll()); //선입선출이니 chae
		System.out.println(queue.size()); //하나꺼냈으니 3
		
		System.out.println();
		while(queue.size() > 0) {
			System.out.println(queue.poll());
			//하나씩 꺼내면서 지운다
		}
		
		System.out.println(queue.size()); //반복문으로 다 꺼냈으니 0
	}
}
