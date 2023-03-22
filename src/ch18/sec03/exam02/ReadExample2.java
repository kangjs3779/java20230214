package ch18.sec03.exam02;

import java.io.*;
import java.util.*;

public class ReadExample2 {
	public static void main(String[] args) {
		
		try (var is = new FileInputStream("output/test2.db")) {
			byte[] data = new byte[5]; //{0,0,0,0,0}
			
			Arrays.fill(data,  (byte) 1);
			//0으로 채우는게 아니라 이전 값으로 계속 남아 있다
			System.out.println(Arrays.toString(data));
			is.read(data); //3개를 읽어서 앞에 3개만 채워지고 뒤에는 이전값으로 채워져 있다
			//무조건 0으로 채워지는 것이 아니다
			System.out.println(Arrays.toString(data));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
