package ch17.lecture.p01stream;

import java.util.stream.*;

public class C07Sream {
	public static void main(String[] args) {
		//IntStream
		//일반 stream에는 없는데 intstream에는 있는 것
		IntStream stream1 = IntStream.range(0, 10); //(시작값(포함), 종료값(불포함))
		System.out.println(stream1.count());
		
		IntStream stream2 = IntStream.rangeClosed(0, 10);
		System.out.println(stream2.count());
		
		
		
	}
}
