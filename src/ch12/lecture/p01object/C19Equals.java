package ch12.lecture.p01object;

public class C19Equals {
	public static void main(String[] args) {
		Object o1 = new MyClass19();
		Object o2 = new MyClass19();
		Object o3 = o1;
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o3.hashCode());
		//해쉬코드를 재정의했기 때문에 재정의한 리턴값으로 나옴
		
		System.out.println(o1.equals(o3));
		System.out.println(o1.equals(o2));
		
		//해쉬코드가 같아도 이퀄즈에서는 false가 나올 수 있다
		//아예 다른 객체라면 해쉬코드가 같아도 false임
		//근데 이퀄즈가 true라면 해쉬코드는 그냥 아묻따 같은거다
		
	}
}

class MyClass19 {
	
	@Override
	public int hashCode() {
		return 33;
		//항상 같은 해쉬코드가 나오도록 재정의를 하였다
	}
	
	@Override
	public boolean equals(Object obj) {
		//그럼 항상 같은 해쉬코드가 나와서 항상 true가 나온다
		return super.equals(obj);
	}
	
	//같다라고 나오기전에 같은 해쉬코드가 나오도록 해쉬코드를 재정의해줘야 한다
}
