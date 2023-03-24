package ch19.lecture.p01network;

import java.io.*;
import java.net.*;
import java.util.stream.*;

public class C02NetworkClinet {
	public static void main(String[] args) {
		// ip 주소
		String ip = "172.30.1.29";
		// port 번호
		int port = 50500;

		try (
				Socket socket = new Socket(ip, port);
				InputStream is = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);) {
			
			char[] buf = new char[1024];
			int len = 0;
			while ((len = br.read(buf)) != -1) {
				System.out.print(new String(buf, 0, len));
			}
			
			System.out.println();

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("프로그램 종료");

	}
}
