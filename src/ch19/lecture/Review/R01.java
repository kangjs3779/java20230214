package ch19.lecture.Review;

import java.net.*;

public class R01 {
	public static void main(String[] args) {
		try {
			InetAddress ia = InetAddress.getLocalHost();
			System.out.println(ia);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
}
