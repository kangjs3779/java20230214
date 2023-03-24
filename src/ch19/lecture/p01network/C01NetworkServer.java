package ch19.lecture.p01network;

import java.io.*;
import java.net.*;

public class C01NetworkServer {
	public static void main(String[] args) {
		// 컴퓨터에 연결을 하기 위해서 ip주소와 port번호가 필요하다
		// ip주소는 내가 어떻게 할 수 없다 이미 공유기로 부터 받은 거니까
		// port번호는 내가 어떻게 할 수 있음

		int port = 50500;
		try (ServerSocket serverSocket = new ServerSo1cket(port);) {
			//연결 기다리는 중

			try (
					Socket socket = serverSocket.accept(); //여기서 잠깐 멈줘있음
					
					OutputStream os = socket.getOutputStream();
					OutputStreamWriter osw = new OutputStreamWriter(os);
					BufferedWriter bw = new BufferedWriter(osw)) {
					
				bw.write("hello ckient");
				
				bw.flush();
				
			}
			// 열어줬으면 닫아줘야 한다

		} catch (Exception e) {
		}
		System.out.println("프로그램 종료");
	}
}
