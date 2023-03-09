package ch13.exercise.check03;

public class ContainerExample {
	public static void main(String[] args) {
		Container<String, String> container1 = new Container<>();
		container1.set("홍길동", "도적");
		String name1 = container1.getKey();
		String job = container1.getValue();
		System.out.println("이름: " + name1 + " 직업 :" + job);
		
		Container<String, Integer> container2 = new Container<>();
		container2.set("홍기동", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();
		System.out.println("이름: " + name2 + " 나이: " + age);
	}
}

class Container<T, U> {
	private T item1;
	private U item2;
	
	public void set(T item1, U item2) {
		this.item1 = item1;
		this.item2 = item2;
	}
	
	public T getKey() {
		return item1;
	}
	
	public U getValue() {
		return item2;
	}
}
