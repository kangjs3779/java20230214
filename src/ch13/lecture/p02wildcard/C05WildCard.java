package ch13.lecture.p02wildcard;

public class C05WildCard {
	public static void main(String[] args) {
		MyClass05<Object> o1 = new MyClass05<Object>();
		addItem(o1);
		
		MyClass05<Number> o2 = new MyClass05<Number>();
		addItem(o2);
		
		//super로 상한선이 그어졌으니까 안된다
		MyClass05<Integer> o3 = new MyClass05<Integer>();
		addItem(o3);
		
	}
	 public static void addItem(MyClass05<? super Number> param) {
		 param.setItem(3);
		 param.setItem(3.14);
		 //out
	 }
}

class MyClass05 <T>{
	private T item;
	
	public T getItem() {
		return item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
}