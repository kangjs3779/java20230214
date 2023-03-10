package ch13.lecture.p02wildcard;

public class C01WildCard {
	public static void main(String[] args) {
		MyClass01<Object> o1 = new MyClass01<>();
		MyClass01<String> o2 = new MyClass01<>();
		
		o1.item = new Object();
		o2.item = new String();
		
		o1.item = new String();
		o2.item = new Object(); //x
		//String != Object 그래서 틀림 타입이 다름
		
		MyClass01<Object> o3 = o2; //x
		o3.item = new Object();
		//타입의 비교라고 생각하면 편함
		//MyClass01<Object> o3 = MyClass01<String> o2
		//타입만 비교했을 때 타입이 다름 그래서 안됨
		//o3.item(Object) = (object) 문법적 오류는 없음
		
		//o3은 오브젝트 상자
		//o2는 스트링 상자에 스트링 값
		
	
		
		
		
		
	}
}
class MyClass01<T> {
	public T item;
	
}
