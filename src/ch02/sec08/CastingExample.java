package ch02.sec08;

public class CastingExample {
	public static void main(String[] args) {
		int var1 = 10; //4bytes
		byte var2 = (byte) var1;//1bytes
		System.out.println(var2);
		
		long var3 = 300; //8bytes
		int var4 = (int) var3; //4bytes
		System.out.println(var4);
		
		int var5 = 65; //4bytes
		char var6 = (char) var5;//2bytes
		System.out.println(var6);
		
		double var7 = 3.14; //8bytes
		int var8 = (int) var7; //4bytes
		System.out.println(var8);
		//정수로 변환을 하고 싶을 때 사용함
	}
}
