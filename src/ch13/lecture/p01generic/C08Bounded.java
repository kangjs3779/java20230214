package ch13.lecture.p01generic;

public class C08Bounded {
	public static void main(String[] args) {
		MyClass08<Integer> o1 = new MyClass08<>(99);
		o1.handleItem();
		
		MyClass08<Double> o2 = new MyClass08<>(3.14);
		o2.handleItem();
		
//		MyClass08<string> o3 = new MyClass08("javq");
		//Number의 하위클래스가 아니라서 String은 올 수 없다
	}
}

//bounded type parameter
class MyClass08<T extends Number> {
	private T item;

	public MyClass08(T item) {
		this.item = item;
	}
	
	public void handleItem() {
		String str = item.toString();
		int hash = item.hashCode();
		boolean eq = item.equals(null);
		
		//itemdl Number 또는 그 하위 타입이므로
		//Number의 메소드를 실행할 수 있음
		int i = item.intValue();
		double d = item.doubleValue();
		//넘버와 그 하위타입이 올거라는 보장이 안된다(그냥쓰면)
		//안전하게 쓰고 싶으면 T가 넘버이거나 그 하위클래스이면 된다
		//<T extends Number> = 상한선이 있는 파라미터
		//넘버부터 그 아래는 다 가능
		//bunded type parameter
		
//		if(item instanceof Number numItem) {
//			int i = numItem.intValue();
//			double d = numItem.doubleValue();
//		}
		
	}
}