package ch15.sec01.exam01;

import java.util.*;
import java.util.stream.*;

public class StreamExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		//set인터페이스 타입에 제네릭타입은 String타입으로 변수를 만들어줌
		//집합set안에 들어있는 원소들의 타입은?? string타입의 원소들이 되겠음
		//set을 구현하는 대표적인 클래스인 hashset클래스로 객체를 만들어줌
		set.add("홍길동");
		set.add("신용권");
		set.add("김자바");
		//세개의 원소를 넣음
		
		Stream<String> stream = set.stream();
		//Stream인터페이스 타입으로 제네릭은 string타입으로 변수를 만들어줌
		//set안에 있는 메소드를 실행시킴
		//stream()메소드는 collection인터페이스 안에 있는 default메소드임
		//stream타입의 메소드로 리턴값이 stream타입임
		//그래서 stream인터페이스 타입의 변수에 collection인터페이스를 상위인터로 상속받는 set에 접근해서 stream메소드에 접근하여
		//리턴값으로 stream타입을 넣은 것이다
		
		stream.forEach(name -> System.out.println(name));
		//stream타입의 리턴값이 들어있는 변수를 통해
		//stream인터페이스 안에 있는 foreach()메소드에 접근함
		//forEach메소드의 파라미터는 consumer인터페이스임
		//consumer인터페이스는 functional interface임 -> 람다 가능, 메소드레퍼런스 가능
		//추상메소드는 void타입의 메소드임
		
		//풀어서 써보기
		//String name -> { System.out.println(name) };
		//
		
		
		
		
	}
}
