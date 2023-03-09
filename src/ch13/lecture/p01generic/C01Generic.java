package ch13.lecture.p01generic;

public class C01Generic {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();
		o1.setItem("java");
		
//		String s1 = o1.getItem();
		//오브젝트는 스트링이다 할 수 없다
		//강제형변환 필요하지만 위험한 코드니까 이렇게 쓰지말고
		
		String s2 = null;
		Object o2 = o1.getItem();
		
		if( o2 instanceof String) {
			s2 =(String) o2;
		}
		
		if(s2 != null) {
			System.out.println(s2.length());
		}
	}
}

class MyClass01 {
	private Object item;
	//필드의 타입이 결정되지 않았을 때 object타입의 변수를 만들었다
	
	public Object getItem() {
		return item;
	}
	
	public void setItem(Object item) {
		this.item = item;
	}
}



//별것도 아닌데 코드가 엄청 김
