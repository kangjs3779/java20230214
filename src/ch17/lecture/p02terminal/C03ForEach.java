package ch17.lecture.p02terminal;

import java.util.*;

public class C03ForEach {
	public static void main(String[] args) {
		
		List<String> list = List.of("java", "css", "html", "jsp");
		
		list.stream()
		.forEach(s -> System.out.println(s));
		
		//consumer
		//functional interface
		//element들이 accept메소드에 순차적으로 들어가도록 함
		//list를 통해 stream안에 있는 foreach의 accept메소드에 순차적으로 들어감
		
		list.stream()
			.forEach(s -> System.out.println("원소: " + s));
		
		
	}
}
