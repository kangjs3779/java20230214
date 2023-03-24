package ch19.lecture.p01network;

import java.io.*;
import java.net.*;

public class C03Server {
	public static void main(String[] args) {
		// 클라이언트는 할지 말지 모르겠는데 나는 하고있는거
		int port = 50500;
		//상대방으로부터 받는 것
		try (
				ServerSocket serverSocket = new ServerSocket(port);
				Socket socket = serverSocket.accept();
				// 클라이언트로부터 받을 것이다
				InputStream is = socket.getInputStream();
				BufferedInputStream bis = new BufferedInputStream(is);
				InputStreamReader isr = new InputStreamReader(bis);) {
			char[] buf = new char[1024];
			int len = 0;

			while ((len = isr.read(buf)) != -1) {
				String data = new String(buf, 0, len);
				System.out.println(data);
			}
			System.out.println();

		} catch (Exception e) {
		}


		System.out.println("프로그램 종료");
	}
}
