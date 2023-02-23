package ch05.sec04;

public class GarbageObjectExample {
	public static void main(String[] args) {
		String hobby = "여행";
		hobby = null;
		
		String kind1 = "자동차";
		String kind2 = kind1;
		kind1 = null;
		//kind1은 자동차 값을 가지는 공간의 주소를 가지고 있다
		//이 주소를 kind2도 가지고 있다
		//kind1의 값이 null이 된다고 해서 자동차 값을 가지는 공간이 쓰레기가 되지는않는다
		//왜냐면 kind2가 자동차 값의 공간 주소를 가지고 있기 때문이다
		System.out.println("kind2 ; " + kind2);
	}
}
