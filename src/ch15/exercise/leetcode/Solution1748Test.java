package ch15.exercise.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import ch15.exercise.leetcode.*;

class Solution1748Test {

	@Test
	void test1() {
		Solution1748 o1 = new Solution1748();
		assertEquals(4, o1.sumOfUnique(new int[] {1, 2, 3, 2}));
	}
	
	
	@Test
	void test2() {
		Solution1748 o1 = new Solution1748();
		assertEquals(0, o1.sumOfUnique(new int[] {1, 1, 1, 1}));
	}
}
