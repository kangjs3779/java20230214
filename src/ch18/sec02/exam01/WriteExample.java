package ch18.sec02.exam01;

import java.io.*;

public class WriteExample {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("output/test1.db");
			//잘들어갔는지 refresh로 확인을 해주고
			
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			os.write(a);
			os.write(b);
			os.write(c);
			//바이트 단위로 3번을 써서 3바이트
			//3바이트가 목적지에 도달함
			
			os.flush();
			//쌓여있던 내용물들이 빠져나가는 느낌 - 구글이미지
			//데이터가 쌓여있으면 목적지에 확 뿌리는 것
			//상속받은 클래스가 이것을 재정의하면 그것을 실행할 뿐 원래는 아무것도 안함
			//아무일도 안하는 것을 버릇처럼 썼지만 종종 일을 하는 flush가 있어서 적은 것
			//안전하게 코드를 작성하기 위한 것
			//이게 있어야 목적지에 도달함
			os.close();
			/*
			 * 사용이 끝나면 꼭 닫아 줘야한다
			 * 그렇지 않으면 다른 곳에서 사용하기 힘들 수 있다
			 * 파일을 지우려고 하는데 어디선가 파일을 사용 중이라 지우지 못하는 경험
			 * 그래서 꼭 닫아 줘야한다
			 * 그냥 습과적으로 둘 다 써라
			 * */
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
