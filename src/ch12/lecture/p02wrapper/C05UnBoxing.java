package ch12.lecture.p02wrapper;

public class C05UnBoxing {
	public static void main(String[] args) {
		Integer i1 = 30; //auto boxing
		
		int i2 = 50;
		
		int i3 = i1 * i2; //지금 버전
		
		//예전 버전
		//예전에는 언박싱도 수동으로 했음
		int i4 = i1.intValue() * i2;
		//지금은 쉽게 가능하니까 이렇게 쓸 필요 없다
		
		int i5 = i1.intValue(); // old unboxing
		int i6 = i1; //new auto unboxing
		
	}
}
