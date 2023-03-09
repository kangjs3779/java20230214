package ch12.lecture.p01object;

public class C18Equals {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = o1;
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o3.hashCode());
		//o1과 o3은 같은 해쉬코드를 가지고 있음
		//같은 ㄱ객체를 가리키고 있음
		
		System.out.println(o1.equals(o3)); //같은 인스턴스를 가리키고 있음 물리적으로 같다 true
		System.out.println(o1.equals(o2)); //해쉬코드가 이미 다르니까 false
		
		
		System.out.println(o3.equals(o1));
		System.out.println(o3.equals(o2));
		
	}
}
