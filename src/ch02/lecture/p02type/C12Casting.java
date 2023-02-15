package ch02.lecture.p02type;

public class C12Casting {
	public static void main(String[] args) {
		//정수끼리, 실수끼리  큰타입에서 작은 타입으로 변환 = 강제 형변환
		//이걸 casting이라고 한다
		int i1;  //4byte
		long l1; //8byte
		
		l1 = 30;
		//i1 = l1; //오류가 난다
		i1 = (int) l1; //강제 형변환(casting)
		System.out.println(i1);
		
		l1 = 3000000000L;
		i1 = (int) l1;
		System.out.println(l1);
		System.out.println(i1);
		
		short s1;
		byte b1;
		
		s1 = 200;
		b1 = (byte) s1;
		
		System.out.println(s1);
		System.out.println(b1);
		
		//실수에서 정수로 변환하는 것 = 강제 형변환(casting)
		double d2;
		int i2;
		
		d2 = 3.14;
		i2 = (int) d2; //강제 형변환
		System.out.println(d2);
		System.out.println(i2); //정수로 변환이 된다
		//소주점을 버리기 위해서 종종 강제 형변환으로 실수를 정수로 변환시키기도 함
		
		short s2;
		char c2;
		
		c2 = 20;
		s2 = (short)c2;
		System.out.println("s2: " + s2);
		
		float f5;
		double d5;
		
		d5 = 3.154;
		f5 = (float)d5;
		System.out.println(f5);
	}
}
