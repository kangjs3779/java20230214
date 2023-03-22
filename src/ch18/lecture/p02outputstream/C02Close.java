package ch18.lecture.p02outputstream;

import java.io.*;

public class C02Close {
	public static void main(String[] args) {
		//단계적으로 적으면서 정리해보기
		//필수코드 4개쓰고
		//try쓰고
		//finally쓰고
		//변수 밖으로
		//null if쓰고
		//catch쓰기
		
		
		//finally 블럭에서도 사용할 수 있게 try 블럭 밖에서 선언
		OutputStream os = null;
		try {
			//스트림 열고
			os = new FileOutputStream("output/output.txt");
			// 어떤 작업하고
			os.write(1);
			
			os.flush(); //습관적으로 써라
			//다 checked exception을 발생시키는 애들이니까 try-catch로 묶어주면 된다			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			if(os != null) {
				try {
					os.close();
					//try를 해서 관련된 checked exception을 잡아줘야 한다
				} catch (IOException e) {
					e.printStackTrace();
				} //꼭 해야 함
				//닫고
				//꼭 해야 하는 거니까 finally안에 들어가야 한다
			}
			//근데 nullpointexception이 발생 할 수 있으니까 이렇게 if문으로 잡아줘야한다
		}
	}
}
