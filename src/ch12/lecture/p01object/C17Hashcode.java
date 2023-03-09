package ch12.lecture.p01object;

public class C17Hashcode {
	public static void main(String[] args) {
		Object o1 = new String("java"); 
		//파라미터가 string 타입인 생성자 호출
		//이 아규먼트가 그대로 복사되어서 출력된다
		Object o2 = new String("spring");
		Object o3 = new String("java");
		
		int h1 = o1.hashCode();
		int h2 = o2.hashCode();
		int h3 = o3.hashCode();
		
		System.out.println(System.identityHashCode(o1));
		System.out.println(System.identityHashCode(o2));
		
		//스트링 클래스 안에 있는 해시코드 메소드에 접근한다
		//원래 오브젝트 안에 있는 해시코드 메소드가 스트링 클래스 안에서 오버라이딩 된 것이다
		//오버라인된 해시코드 메소드는 문자열 배열에 맞추어서 계산을 한다
		//그래서 새로운 객체를 생성했더라도 그 안에 있는 문자열이 같으면 같은 해시코드가 출력되는 것이다
//		System.out.println(o1); //복사되어서 출력된다
		
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		
		//1이랑 3은 같다
		//자바사전에 해쉬코드를 만드는 식이 나와있다
		//각문자열에 값을 더한 것이다
		//문자열이 같으면 같은 값으로 해쉬코드를 계산하기 때문에 해쉬코드가 같다

		
	}
	
	@Override
	public String toString() {
		return "재정의";
	}
}

