package ch18.lecture.p06buffered;

import static org.hamcrest.CoreMatchers.*;

import java.io.*;

public class C06BufferedReader {
	public static void main(String[] args) {
		String name = "output/buffered5.txt";
		
		try (FileReader fr = new FileReader(name);
				BufferedReader br = new BufferedReader(fr);) {
			//주요 메소드
			//readLine - 한 줄씩 읽어준다
			
			String s = br.readLine();
			System.out.println(s);
			//한줄 읽고 출력
			
			//읽을게 없을 때까지 반복
			//끝에 다다르면 null을 출력한다
			
			String s1 = null;
			
			while((s1 = br.readLine()) != null) {
				System.out.println(s1);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
