package ch02.lecture.p02type;

public class C13Expression {
	public static void main(String[] args) {
		//연산 중 자동 형변환
		
		byte b1 = 30;
		byte b2 = 10;
		
//		byte b3 = b1 + b2; //byte, short, char, int의 연산 결과는 int
		//어차피 결과는 int이기 때문에 byte타입의 변수에는 넣을 수가 없다
		
		int i3 = b1 + b2; //이건 가능
		
		byte b4 = (byte) (b1 + b2);
		//byte로 굳이 담고 싶으면 이렇게 강제 형변환을 해주면 된다
		byte b5 = 30 + 10; //이건 가능함 리터럴값은 바로 계산을 해서 출력이 된다
		//변수로 지정되어 있는 것은 int로 변환이 되는데 리터럴 그자체의 연산은 괜찮음
		
		// 정수간의 연산에서 long이 포함된 연산의 결과는 long
		long l6 = 30;
		long l7 = 10;
//		int i6 = l6 + l7; //작은 공간인 int에는 넣을 수 없음
		long l8 = l6 + l7; //이건 가능
		
		int i9 = 20;
		long l10 = i9 + l7; //long이 포함되어 있으므로 최종적인 결과값의 타입은 long이 된다
		int i10 = (int) (i9 + l7); //굳이 int에 담고 싶다면 이렇게 적으면 된다
		
		//정수와 실수끼리 연산 결과는 실수
		int i11 = 30;
		double d11 = 3.14;
		
		double d12 = i11 + d11; //정수와 실수의 연산이라서 실수 타입의 변수인 double에 담았음
		System.out.println("d12의 값은 실수인 " + d12);
		int i12 = (int)(i11 + d11);
		System.out.println("i12의 값은 정수인 " + i12);
		
	}
}
