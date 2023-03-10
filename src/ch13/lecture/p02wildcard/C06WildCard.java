package ch13.lecture.p02wildcard;

public class C06WildCard {
	public static void main(String[] args) {
		MyClass06<Object> o1 = new MyClass06<Object>();
		MyClass06<Object> o2 = new MyClass06<String>(); //x
		
		MyClass06<?> o3 = new MyClass06<Object>();
		MyClass06<?> o4 = new MyClass06<Object>();
		
		MyClass06 o5 = new MyClass06();
		
		
		
	}
}

//상위든 하위든 상관없이 다 받고 싶을 때 사용 하는 것
class MyClass06<T> {
	public T item;
	
}
