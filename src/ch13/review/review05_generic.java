package ch13.review;

public class review05_generic {
	public static void main(String[] args) {
		MyClass05<Object> o1 = new MyClass05<>();
		//오브젝트 = 부모
		//부모타입에 부모참조값
		MyClass05<String> o2 = new MyClass05<>();
		//스트링 = 자식
		//자식타입에 자식참조값

		o1.item = new Object();
		//부모타입에 부모참조값
		o2.item = new String();
		//자식타입에 자식참조값
		
		o1.item = new String();
		//부모타입에 자식참조값
		o2.item = new Object();
		//자식타입에 부모참조값
		//안됨
		
		MyClass05<Object> o3 = o2;
		//부모타입에 자식참조값 - 엥? 왜안됨?
		//오른쪽을 기준으로 잡고 오른쪽은 스트링 왼쪽은 오브젝트
		//타입대 타입을 비교하는 거니까 안됨
		o3.item = new Object();
		//부모타입에 부모값
		//오브젝트값은 
		
		
		String s1 = "java";
		Object f = s1;
		String x = new String();
		Object s4 = x;
		//부모타입에 자식타입의 자식참조값
		Object item1 = s1;
		//부모타입에 자식값
		
		System.out.println("실행 가능");
		
	}
	
	
}

class MyClass05 <T> {
	public T item;
}