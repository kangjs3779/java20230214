package ch07.lecture.p03cast;

public class C02Cast {
	public static void main(String[] args) {
		Super02 o1 = new Sub02();
		
		Sub02 o2 = (Sub02) o1;
		//o1이 가리키는 것도 위아래 모두 Sub02를 가리키니까 강제형변화 OK
		
		Super02 o3 = new Super02();
		
		Sub02 o4 = (Sub02) o3;
		//코드에는 문제가 없는데 exception이 발생해서 실행이 종료되어버린다
		//ClassCastException
		//함부로 작성하지 말고 주의를 기울여서 작성을 해야 하는 코드이다
		
		
		System.out.println("실행코드 이어짐");
	}
}

class Super02 {
	
}

class Sub02 extends Super02 {
	
}
