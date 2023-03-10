package ch13.lecture.p02wildcard;

public class C02WildCard {
	public static void main(String[] args) {
//		MyClass02<Object> o1 = new MyClass02<String>(); //안된다
		MyClass02<? super String> o1 = new MyClass02<String>(); 
		o1.item = new String(); //String 또는 그 하위타입 대입 가능
		//값이 out 값이 나감 = super
		//프로그램을 기준으로 값이 나감
		
		//쉽게 가자
		//MyClass02<? super String> o1 = new MyClass02<String>();
		//String도 되고 object도 된다 = string만 된다
		//그럼 같은거 맞지
//		o1.item = new String();
		//스트링 오브젝트 가능하지 = 스트링만 되지
		//같은거 맞지
		//항상 오른쪽을 기준으로 왼쪽에 포함되는지 안되는지 확인을 해라
		
		
		String s1 = o1.item; //안된다
		//당연히 되어야 하는 거 아닌가 싶지만 <? super String> 여기에서
		//스트링보다 상위 클래스인 것으로 선언을 했기 때문에
		//item의 타입은 스트링의 부모이다
		//그래서 String 안에 담을 수 없다
		//그럼 값을 어떻게 꺼내서 변수에 담을 수 있을까
		//스트링만 되지 = 스트링 오브젝트 되지
		//근데 오브젝트가 왼쪽에 없으니까 안되는 거 맞지
		
		
		MyClass02<? extends String> o2 = new MyClass02<String>();
		String s2 = o2.item; //된다
		//프로그램을 기준으로 값이 들어옴
		//값이 들어올 떄 (in) (extends)
		
		
		
	}
}


class MyClass02<T> {
	public T item;
}