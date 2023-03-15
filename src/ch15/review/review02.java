package ch15.review;

import java.util.*;

public class review02 {
	//int타입 파라미터 비교
	public static void main(String[] args) {
		List<Person02> list1 = List.of(
				new Person02("son", 30),
				new Person02("cha", 50),
				new Person02("park", 30)
				);
		
		
		//리스트는 클래스타입으로 만들었다
		//클래스 타입의 유동적인 배열
		//그럼 원소도 클래스 타입
		//원소가 클래스타입이면 객체화시켜야 한다
		//객체화는 생성자호출이 필요함 = new + 생성자를 통해 원소만듦
		//Person02에서 생성자는 파라미터가 있는 것으로 선언이 되었음 = 기본생성자 자동삽입안된다
		//새로운 객체를 세개를 만듦(new라는 키워드로)
		
		
		
		List<Person02> list2 = new ArrayList<>(list1);
		//<>(여기)
		//ArrayList클래스의 생성자는 세개가 있음
		
		
//		Collections.max(list2);
		
		//뭘비교할 건지 안정했음
		//이름순인지 나이순인지 모름 그래서 오류남
		
		Person02 max = Collections.max(list2, (Person02 a, Person02 b) -> a.getAge() - b.getAge());
		System.out.println(max.getAge());
		//for문처럼 두개를 비교한다
		//첫번째 파라미터는 collection interface타입이 들어간다
		//List는 collection을 상속받는 interface이다(List extends Collection)
		//List interface 타입의 list2를 넣어줬음
		//근데 list2는 Person02 class타입임 = 원소는 class객체타입이라는 뜻임
		
		
		//Person02의 생성자는 파라미터 String과 int가 순서대로 들어감
		//두번째 파라미터는 Comparator라는 functional interface가 들어간다
		//그럼 추상메소드 재정의가 필요함
		//추상메소드는 int compare(T o1, T o2);
		//정수타입의 compare라는 이름의 파라미터는 T타입으로 2개를 가지고 있는 추상메소드
		//무슨 타입이든 두개의 파라미터는 같은 타입이라는 거지
		//재정의를 위해서는 class가 필요함. 
		//풀어서 쓰면 (익명개체로)
		Comparator o1 = new Comparator() {
			@Override
			public void compare(Person02 a, Person02 b) {
				a.getAge() - b.getAge();
			}
		};
		
		Comparator o2 = new MyClass();
		class MyClass {
			
		}
		//getAge는 int타입의 age를 리턴하니까
		//T는 int라는 것을 추론할 수 있음
		
		//익명개체를 사용한 것을 람다로 더 간결하게 표현을 해줌
		//(a, b) -> a.getAge() - b.getAge()
		//파라미터 두개를 임의의 이름 a와 b로 정해줌 -> 타입은 뭔지모름 근데 어떻게 알지?
		//a.getAge()를 통해서 int임을 추론할 수 있음
		//그래서 a, b는 int 타입인 것이 확실시 된다
		
		
		//쉽게 생각하면 첫번째 파라미터에는 비교하고 싶은 list이름을 적음
		//비교할게 여러개라 오류가 나면
		//두번째 파라미터에는 뭘비교하고 싶은지 코드로 작성하면 되는 거다
		
		
		
		
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
