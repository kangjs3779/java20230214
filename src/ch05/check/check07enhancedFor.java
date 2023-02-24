package ch05.check;

public class check07enhancedFor {
	public static void main(String[] args) {
		//최댓값을 출력해라
		int[] array = {-1, -5, -3, -8, -2};
		//음수의 범위를 주는 것 0이랑 비교하면 안된다 그럼 음수값이 있을 때 오류가 나니까
		//음수의 범위도 가져갈 수 있도록 한다
		float a = Float.MIN_VALUE; //float이라는 값에 범위를 정확하게 줌
		int max = Integer.MIN_VALUE;
		System.out.println(max);
		int min = Integer.MAX_VALUE;
		System.out.println(min);
		
		for(int n : array) {
			if (n > max) {
				max = n;
			}
		}
		System.out.println(max);
		
		// index랑 최댓값을 같이 뽑아라
		int[] array1 = {1, 5, 3, 8, 2};
		
		int max1 = Integer.MIN_VALUE;
		int indexOfMax = 0;
		for (int i = 0; i < array.length; i++) {
			if(max1 < array[i]) {
				max = array[i];
				indexOfMax = i;
			}
		}
		System.out.println("최대값: " + max);
		System.out.println("최대값의 index : " + indexOfMax);
	}
}
