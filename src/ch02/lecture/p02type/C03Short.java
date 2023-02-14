package ch02.lecture.p02type;

public class C03Short {
	public static void main(String[] args) {
		//byte(2 byt, 16 bits)
		//가장 작은 값 (1000 0000 0000 0000) 두개의 byte (-32768)
		//가장 큰 값 (0111 1111 1111 1111) (32767)
		//그냥 아 범위가 있구나 정도만 알면 된다
		
		short s1;
		s1 = 0;
		s1 = 32767;
		
		short s2 = -32769;
		short s3 = 32768;
		System.out.println(s2);
		System.out.println(s3);
		
// 		s1 = 32768;
//		s1 = = - 32769;
	}
}
