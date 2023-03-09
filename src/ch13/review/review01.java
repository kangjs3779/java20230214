package ch13.review;

public class review01 {
	public static void main(String[] args) {
		Class01<String, String, Integer> o1 = new Class01<>();
		
		
		o1.setField1("집가고 싶다");
		o1.setField2("지금 당장");
		o1.setField3(21);
		
		
		
	}
	
}

class Class01<T, U, V> {
	private T field1;
	private U field2;
	private V field3;
	
	public void setField1(T field1) {
		this.field1 = field1;
		System.out.println(field1);
	}
	
	public void setField2(U field2) {
		this.field2 = field2;
		System.out.println(field2);
	}

	public void setField3(V field3) {
		this.field3 = field3;
		System.out.println("지금 오후 " + field3 + "시다");
	}
	
	
}

