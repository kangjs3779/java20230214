package ch18.lecture.p04writer;

import java.io.*;

public class C02Writer {
	public static void main(String[] args) {
		String name = "output/writer2.txt";
		
		try(var wr = new FileWriter(name)) {
			//추상클래스라서 인스턴스를 못만드는 거였음
			//그래서 하위클래스로 만드는 거였음
			char[] data = {'가', '나', '다', 'a', 'b' };
			
			wr.write(data);
			wr.write("hello world");
			wr.write("""
					<h1>lorem Ipsum</h1>
					""");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
