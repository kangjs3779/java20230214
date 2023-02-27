package ch06.sec04;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student(); //instance를 만들었음
		//s1객체가 가리키고 있는 참조값이구나
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
		
		System.out.println(s1 == s2); //false
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		//참조값을 알고 싶다면 이렇게 적으면 된다
	}
}
