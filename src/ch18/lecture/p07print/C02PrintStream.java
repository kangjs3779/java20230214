package ch18.lecture.p07print;

import java.io.*;

public class C02PrintStream {
	public static void main(String[] args) {
		String name = "output/print2.txt";
		
		try (PrintStream pw = new PrintStream(name);){
			pw.println(99999);
			pw.println(9999.9);
			pw.println(false);
			pw.println("hello world");
			pw.println("짠");
			//C01이나 C02나 별차이 없이 사용하면 된다

			System.out.println();
			//out에 호버를 해보면 printstream타입이다
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
