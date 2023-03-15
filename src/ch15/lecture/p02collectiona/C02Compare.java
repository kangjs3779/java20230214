package ch15.lecture.p02collectiona;

import java.util.*;

public class C02Compare {
	public static void main(String[] args) {
		List<Person02> list1 = List.of(
				new Person02("son", 30),
				new Person02("cha", 50),
				new Person02("park", 40)
				);
		
		//여기서 어떻게 크다 작다를 볼 수 있을 까
		List<Person02> list2 = new ArrayList<>(list1);
		
//		Collections.max(list2); //오류남
		//max메소드는 collection차입을 파아리터로 받음, comparable타입이여야 한다
		
		//Comparator.compare메소드
		//다음 세개 중 하나의 값을 리턴
		//음수 : 첫번째 매개값이 작으면
		//0 : 두값이 같으면
		//양수 : 첫번째 매개값이 크면
		Person02 maxAge = Collections.max(list2, (a,b) -> a.getAge() - b.getAge());
		System.out.println(maxAge.getName() + ", " + maxAge.getAge());
		
		Person02 minAge = Collections.min(list2, (a, b) -> a.getAge() - b.getAge());
		System.out.println(minAge.getName() + ", " + minAge.getAge());

		System.out.println(list2); //왜 참조값이 나와
		//toString을 재정의하지 않으면 참조 값이 나옴

		System.out.println(list2);
		Collections.sort(list2, (x, y) -> x.getAge() - y.getAge());
		System.out.println(list2);
		
		//------------- 나이순이었음
		
//		Collections.sort(list2, (x, y) -> /*이름 비교*/ x.getName() - y.getName()); //String은 빼기 연산자 사용할 수 없음
		//CompareTo - 문자순대로 비교를 한다
		//음수, 0, 양수를 리턴한다
		//0 : 두 문자열이 같으면 0
		//음수 :
		//양수
		
		//이름순 정렬
		Collections.sort(list2, (x, y) -> x.getName().compareTo(y.getName()));
		
	}
}

class Person02 {
	private String name;
	private int age;
	
	public Person02(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person02 [name=" + name + ", age=" + age + "]";
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}