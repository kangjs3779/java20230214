package ch12.lecture.p01object;

public class C20Equals {
	public static void main(String[] args) {
		Object o1 = new String("java");
		Object o2 = new String("spring");
		Object o3 = new String("java");
		Object o4 = o1;
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o3.hashCode());
		System.out.println(o4.hashCode());
		
		System.out.println(o1.equals(o4)); //true
		System.out.println(o1.equals(o3)); //true
		
		//이퀄즈에서 트루이면 해쉬코드가 똑같다는 것을 의미한다
		//이퀄즈가 트루가 나오기 전에 해쉬코드가 똑같아야 하니까
		//해쉬코드 같음이 선행되어야 한다
		
	}
}
