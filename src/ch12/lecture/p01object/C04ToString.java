package ch12.lecture.p01object;

public class C04ToString {
	public static void main(String[] args) {
		Object o1 = "java";
		Object o2 = new String("java");
		
		System.out.println(System.identityHashCode(o1));
		System.out.println(System.identityHashCode(o2));
		
		//재정의를 하면 toStrigng에서 참조값이 나오지않고
		//재정의한 메소드가 실행된다
		
	}
}
