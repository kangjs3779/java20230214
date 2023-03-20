package ch17.lecture.p03intermediate;

import java.util.*;
import java.util.stream.*;

public class C04Distinct {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(3);
		list.add(1);
		list.add(0);
		list.add(0);
		
		
		Stream<Integer> stream1 = list.stream();
		
		Stream<Integer> stream2 = stream1.distinct();
		
		list.add(2);
		//count연산이 일어나기 전에는 stream과 distinct는 일어나지 않는다
		// 최종연산을 할 때 중간연산이 일어난다
		//중간에 이런식으로 원래의 것을 변경하는 코드는 왠만하면 하지 마라 이건그냥 예제라서 하는 거임
		//최종연산 실행 시 중간연산이 한번에 실행됨
		long count1 = stream2.count();
		System.out.println(count1);
		
	}
}
