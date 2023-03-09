package ch12.lecture.p01object;

public class C21Equals {
	public static void main(String[] args) {
		Object o1 = new MyClass21(5);
		Object o2 = new MyClass21(5);
		Object o3 = new MyClass21(6);

		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o1.equals(o2));
		//너와내가 가지고 있는 책이 물리적으로 달라도 같은 내용을 담고 있으니 같은 책이라고 하고 싶다
		System.out.println(o1.equals(o2));
		System.out.println(o1.equals(o3));
	}
}

class MyClass21 {
	private int id;
	
	MyClass21(int id) {
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof MyClass21 o) {
			return this.id == o.id;
		}
		return false;
	}
	
	//이퀄즈를 재정의하기 전에 해쉬코드 재정의해서 해쉬코드를 같게 만들어주어야 한다
}
