package ch15.exercise.leetcode;

import java.util.*;

public class Solution844 {
	public boolean backspaceCompare(String s, String t) {
		Stack<String> stackS = new Stack<>();
		Stack<String> stackT = new Stack<>();
		
		//문자를 하나하나 쪼개서 스택에 넣기
		//#이면 전에 문자 빼기
		String[] s1 = s.split("");
		String[] t1 = t.split("");
		
		for(String str : s1 ) {
			stackS.push(str);
			if(str == "#") {
				stackS.pop();
				stackS.pop();
			}
		}
		
		for(String str : t1) {
			stackT.push(str);
			if(str == "#") {
				stackT.pop();
				stackT.pop();
			}
		}
		
		boolean result = true;
		//두 스택 비교하기
		while (stackS.size() > 0) {
			while (stackT.size() > 0) {
				if(stackS.equals(stackT)) {
					result = true;
				} else {
					result = false;
				}
			}
		}

		return result;

	}
}
