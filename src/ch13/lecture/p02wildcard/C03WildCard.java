package ch13.lecture.p02wildcard;

public class C03WildCard {
	public static void main(String[] args) {
		//지역변수??
		MyClass03<? super Number> o1 = new MyClass03<Number>();
		MyClass03<? super Number> o2 = new MyClass03<Object>();
		//넘버아니면 오브젝트임
		
//		o1.item = new Number(); //추상 메소드라서 안되는 거임
		o1.item = new Integer(); //안된다
		//o1은 넘버의 슈퍼타입 중 하나니까 넘버를 포함해서 그 하위 타입은 모두 안된다
		//super라서 안된다
		
		MyClass03<? extends Number> o3 = new MyClass03<Number>();
		MyClass03<? extends Number> o4 = new MyClass03<Integer>();
		MyClass03<? extends Number> o6 = new MyClass03<Double>();
		
		Number n1 = o4.item; // ok
		//넘버타입에 인티저 가능
		
		Object o5 = o4.item; // ok
		//오브젝트 타입에 인티저 가능
		
		Integer i1 = o4.item; // xx
		//인티저 타입에 인티저일수도 넘버일 수도 있어서 불가능
		
	}
}

class MyClass03<T> {
	public T item;
}
