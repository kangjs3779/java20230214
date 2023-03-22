package ch18.lecture.p02outputstream;

import java.io.*;

public class C01OutputStream {
	public static void main(String[] args) {
		//outputstream
		//바이트 단위 출력 스트림
		
		try {
			String des = "output/output1.txt";
			OutputStream os = new FileOutputStream(des);
			//API검색해서 생성자가 뭐가 있는지 확인하고 쓰면 된다
			//저 클래스는 예외를 던지고 있는데 그 예외는 checked 예외여서 
			//쓸 때 잡거나 던져워야 한다
			
			os.write(250);
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		//이렇게 캐치를 두개를 써도 되고 아니면 상위타입으로 한개만 써도 된다
		System.out.println("프로그램 종료");
		//실행을 시키고 해당 파일의 오른쪽 버튼 - refresh - 더블클릭 - 1byte임을 확인
	}
}
