package ch14.sec04_15.exam02;

import java.util.*;
import java.util.concurrent.*;

public class Hashtable {
	public static void main(String[] args) {
		Map<String, Integer> map = new ConcurrentHashMap<>();

		Thread threadA = new Thread() {
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					map.put(String.valueOf(i), i);
				}
			}
		};

		Thread threadB = new Thread() {
			public void run() {
				for (int i = 1001; i <= 2000; i++) {
					map.put(String.valueOf(i), i);
				}
			}
		};
		
		threadA.start();
		threadB.start();
		
		try {
			threadA.join();
			threadB.join();
		} catch (Exception e) {
		}
		
		int size = map.size();
		System.out.println("총 엔트리 수: " + size);
		System.out.println();
	}
}