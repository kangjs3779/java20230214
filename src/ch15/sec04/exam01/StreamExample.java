package ch15.sec04.exam01;

import java.util.*;
import java.util.stream.*;

public class StreamExample {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		//List인터페이스 타입에 제네릭 타입은 Product클래스인 변수 list선언
		//List인터페이스를 구현하는 대표적인 클래스 ArrayList를 통해서 객체를 만듦
		
		
		for(int i = 1; i <= 5; i++) {
			//반복문시작, i는 1부터 시작을 하고 1씩더해서 5가 될 때까지만 진행 할 거임
			//진행을 할 때마다 아래의 코드를 반복할 거임
			
			Product product = new Product(i, "상품" + i, "멋진 회사", (int)
			//Product는 concrete class임
			//Product클래스 타입의 변수를 만들어서 객체를 만드는데
			//Product클래슨에 생성자를 파라미터 3개로 다시 선언했으니까 그것에 맞춰서 객체생성함
					(10000*Math.random()));
					//random()메소드는 double타입을 리턴함 그래서 (int)로 cast(강제 형변환)을 해줌
					list.add(product);
					//list에 접근해서 새로 만든 객체 product를 추가해줄 거임
					
					//이걸 5번 반복
					//list에는 총 5개의 product클래스 타입의 새로운 객체들이 들어가 있음
		}
		
		Stream<Product> stream = list.stream();
		//위의 반복문을 Stream의 내부반복자를 이용해서 더 간결한 코드를 작성할 거임
		//제네릭 타입은 Product클래스 타입의 Stream타입의 변수를 선언해줌
		//list를 통해서 Stream메소드에 접근하는 것을 변수에 담아줌
		stream.forEach(p -> System.out.println(p));
		//stream에 있는 foreach를 통해서 람다식으로 추상메소드 재정의해준뒤 출력해줌
	}
	
	
}
