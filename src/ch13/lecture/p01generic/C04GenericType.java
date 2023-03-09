package ch13.lecture.p01generic;

public class C04GenericType {
	public static void main(String[] args) {
		MyClass04<String, Integer> o1 = new MyClass04<>();
		o1.setItem("hello");
		o1.setItem2(99);
		
		String s1 = o1.getItem();
		int s2 = o1.getItem2();
		
		MyClass04<String, String> o2 = new MyClass04<>();
		MyClass04<Integer, String> o3 = new MyClass04<>();
		//내가 원하는 변수타입으로 넣을 수 있다
		
	}
}

//여러개의 변수를 콤마로 연결해서 계속 넣을 수 있다
class MyClass04<T, U> {
	private T item;
	private U item2; //무슨 타입인지는 모르겠지만 다른 타입으로 넣고 싶을 때 다른 변수를 넣으면 된다
	
	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	public U getItem2() {
		return item2;
	}

	public void setItem2(U item2) {
		this.item2 = item2;
	}
}
	
