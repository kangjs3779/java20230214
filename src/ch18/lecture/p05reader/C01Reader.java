package ch18.lecture.p05reader;

import java.io.*;

import javax.annotation.processing.*;
import javax.lang.model.element.*;
import javax.tools.*;
import javax.tools.JavaFileManager.*;

public class C01Reader {
	public static void main(String[] args) {
		//Reader : 문자단위 입력 스트림
		//주요 메소드 : read
		
		String name = "output/writer2.txt";
		
		try(Reader rd = new FileReader(name)) {
			int c1 = rd.read();
			//읽은 글자를 int로 변환해서
			//'가'의 유니코드가 변수에 들어감
			System.out.println(c1);
			
			//꼭 문자로 출력을 하고 싶다면 강제 형변환을 통해 가능 하다
			System.out.println((char) c1);
			
			//끝에 도달하면 -1을 리턴한다
			int data = 0;
			while ((data = rd.read()) != -1) {
				System.out.println(data + ":" + (char) data);
			}
			//궁금한 것 : read메소드를 통해서 글자를 읽으면
			//또 읽을 수는 없는건가??
			//출력이 되어버려서 그런건가??
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
