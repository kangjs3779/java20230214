package ch06.lecture.p07constructor;

public class MyClass04 {
	String model;
	int price;
	
	MyClass04(String modelParam, int priceParam) {
		model = modelParam;
		price = priceParam;
	}
	//파라미터의 값이 곧 필드의 값이다
	//그래서 필드명과 같은 이름을 쓰고 싶다
	//그럼 this를 쓰면 된다
	
	MyClass04(String model, int price) {
		this.model = model;
		this.price = price;
	}
	//이렇게 적으면 된다
	
	void desc() {
		System.out.println("모델: " + model);
		System.out.println("가격: " + price);
	}
}
