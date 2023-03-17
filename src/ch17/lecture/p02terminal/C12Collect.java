package ch17.lecture.p02terminal;

import java.util.*;

public class C12Collect {
	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 9, 8, 7);
		List<Integer> r1 = list.stream()
				.collect(ArrayList::new, List::add, List::addAll);
		// collect는 파라미터 3개를받는게 있고 한개를 받는게 있음 - 한개받는 걸 많이 씀
		// 세개짜리 - 첫파라미터 수집한 element의 목적지/return값 객체를리턴함(제네릭타입이라서 원소가 들어갈 객체 타입)
					// 두번째파라미터 - 어떻게 넣어줄건데?? 함수형 인터페이스임, void accept(T t,U u)
					// 세번째파라미터 - 하나의 스트림을 여러 스트림으로 나누어져 실해되어 여러 배열이 만들어진 것을 어떻게 합칠 것인가
		System.out.println(r1);
	}
}
