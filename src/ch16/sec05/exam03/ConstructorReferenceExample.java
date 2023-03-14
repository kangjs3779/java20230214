package ch16.sec05.exam03;

public class ConstructorReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();
		//person 클래스 객체를 만듦
		
		Member m1 = person.getMember1(Member::new);
		//Member m1 = person.getMember1(s -> new Member(s));
		System.out.println(m1);
		System.out.println();
		
		//Member m2 = person.getMember2((s, t) -> new Member(s, t));
		Member m2 = person.getMember2(Member :: new);
		System.out.println(m2);
	}
}
