package ch19.lecture.p02http;

import java.io.*;
import java.net.*;

public class C01Server {
	public static void main(String[] args) {
		int port = 80;
		// 서버 실행하고 브라우저 열어서 내 ip주소 들어가면 서버 종료
		// 브라우저에 내 ip주소를 치면 된다
		// 윈도우 + r -> ipconfig -> 그럼 실행 된다
		try (
				ServerSocket serverSocket = new ServerSocket(port);) {
			System.out.println("요청을 기다리는 중...");

			try (
					Socket socket = serverSocket.accept();
					InputStream is = socket.getInputStream();
					InputStreamReader isr = new InputStreamReader(is);
					BufferedReader br = new BufferedReader(isr);) {

				String line = br.readLine(); // 한 줄만 읽도록 했음
				System.out.println(line);
//				String line = ""; //여러 줄을 읽도록 함
//				
//				while((line = br.readLine()) != null) {
//					System.out.println(line);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("서버 종료!");
	}

}
