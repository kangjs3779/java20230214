package ch19.lecture.p01network;

import java.io.*;
import java.net.*;

public class C04Client {
	public static void main(String[] args) {
		//내가 쓴 데이터가 상대방한테 감
		//상대방이 C03실행하고 내가 Co4실행하면 내가 쓴 데이터가 간다
		//ip주소
		String ip = "172.30.1.29";
		//port번호
		int port = 50500;
		
		try (
				Socket socket = new Socket(ip, port);
				OutputStream os = socket.getOutputStream();
				BufferedOutputStream bos = new BufferedOutputStream(os);
				PrintStream ps = new PrintStream(bos);
				) {
			ps.println("쿨민트 나도 먹을래~~");
			
			ps.flush();
			
		}catch (Exception e) {
		}
		
		
		
		System.out.println("클라이언트 종료");
	}
}
