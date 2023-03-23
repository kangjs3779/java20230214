package ch18.exercise.exam07;

import java.io.*;

public class Example {
	public static void main(String[] args) throws Exception {
		String filePath = "src/ch18/exercise/exam07/Example.java";
		//파일의 경로
		
		FileReader fr = new FileReader(filePath);
		//파일을 열어주는 입력 클래스 객체를 만들어준다
		BufferedReader br = new BufferedReader(fr);
		//버퍼에 담아준다
		
		int rowNumber = 0;
		String rowData;
		while(true) {
			rowNumber++;
			//라인이 1부터 시작이니까 일단 더해주고 시작한다
			rowData = br.readLine();
			//버퍼에 있는걸 한줄씩 읽어서 변수에 담아준다
			if(rowData == null) break;
			//만약에 읽을게 없어서 null을 리턴하면 반복문을 끝낸다
			System.out.println(rowNumber + ": " + rowData);
			//라인번호와 함께 출력한다
		}
		
		br.close();
		//스트림을 닫아준다
		fr.close();
		//스트림을 닫아준다
		
	}
}
