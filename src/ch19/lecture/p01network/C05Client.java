package ch19.lecture.p01network;

import java.io.*;
import java.net.*;
import java.util.*;

public class C05Client {
	public static void main(String[] args) {
		//상대방이 C03을 실행한 다음에 내가 C05를 실행해서 데이터 보내면 된다
		//ip주소
		String ip = "172.30.1.29"; //상대방 아이피 주소를 넣어주면 된다
		//port번호
		int port = 50500;
		//내가 상대방 컴퓨터로 전송하는 것!!
		try (
				Socket socket = new Socket(ip, port);
				OutputStream os = socket.getOutputStream();
				BufferedOutputStream bos = new BufferedOutputStream(os);
				PrintStream ps = new PrintStream(bos);
				) {
			String input = "";
			try (Scanner scanner = new Scanner(System.in)) {
				System.out.println("서버에게 보낼 데이터 작성");
				input = scanner.nextLine();
			}
			
			ps.println(input);
			
			ps.flush();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println("클라이언트 종료");
	}
}
