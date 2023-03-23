package ch18.lecture.p06buffered;

import java.io.*;

public class C05BufferedWriter {
	public static void main(String[] args) {
		String name = "output/buffered5.txt";
		try (FileWriter fw = new FileWriter(name);
				BufferedWriter bw = new BufferedWriter(fw);) {
			//fw보다 bw가 더 빠르다
			//하드디스크까지 갔다오는 횟수가 좀더 적기때문이다
			
			for(int i =0; i < 10; i++) {
				bw.write("helllo world");
				bw.newLine();
				//열줄 쓰는 코드
			}
			
			bw.flush(); //버터가 있으면 이 코드를 써줘야 한다
			//버퍼를 쌓아놓고 안쓰는 경우가 있기 때문이다
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
