package ch15.sec04.exam03;

import java.util.stream.*;

public class StreamExample {
	public static int sum;
	
	public static void main(String[] args) {
		IntStream stream = IntStream.range(1, 100);
		stream.forEach(a -> sum += a); //로컬 익명 클래스를 쓴거나 다름없음
		//크래서 sum을 로컬 변수를 사용하지 않는 이유는 
		//로컬클래스에서 파라미터나 로컬변수를 쓸 떄 그값은 final로 되어서 한번만 할당이 가능 하기 때문에
		//sum을 메소드 밖의 field로 뺌
		System.out.println("총합 : " + sum);
	}
}
