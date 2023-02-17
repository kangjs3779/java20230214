package ch03.sec06;

public class ComparisonOperatorExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2); 
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2); //유니코드로 변환 후 코드로 비교가능
		System.out.println("result4: " + result4);
		
		int num3 =1;
		double num4 = 1.0;
		boolean result5 = (num3 == num4); //정수타입과 실수타입의 연산으로 결과값은 실수값이 되었다
		System.out.println("result5: " + result5);
		
		float num5 = 0.1f;
		double num6 = 0.1;
		boolean result6 = (num5 == num6);
		boolean result7 = (num5 == (float)num6); //결과값이 double이라서 float으로 강제변환 후 비교연산
		System.out.println("result6: " + result6);
		System.out.println("result7: " + result7); 
		
		String str1 = "자바";
		String str2 = "Java";
		boolean result8 = (str1.equals(str2));
		boolean result9 = (! str1.equals(str2));
		System.out.println("result8: " + result8);
		System.out.println("result9: " + result9);
	}
}
