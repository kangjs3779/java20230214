package ch17.lecture.p01stream;

import java.util.stream.*;

public class C01Stream {
	public static void main(String[] args) {
		//여러 원소(element)의
		//순차적 처리 기능(메소드)을 제공하는 class, interface
		
		//스트림 만들기
		Stream<Integer> stream1 = Stream.of(5,1,3,9,10,0);
		
		//스트림 메소드(연산)
		//1. 최종 연산 (terminal operation)
		//	 리턴타입 : Stream 아님 (항상 맞는 건아님)
		//	 최종 연산 시 중간연산도 같이 실행됨
		
		// 개수 세기 (count)
		stream1.count(); //long타입을 리턴함
		stream1.findFirst(); //exception나옴 : 한번 흐른 것을 다시 재생할 수 없다
		//최종연산 후 재사용 불가
		
		
		
		//2. 중간 연산 (intermediate operation)
		//	 리턴타입 : Stream
		
	}
}
