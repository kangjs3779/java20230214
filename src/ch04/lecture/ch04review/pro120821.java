package ch04.lecture.ch04review;

public class pro120821 {
	public static void main(String[] args) {
		int[] num_list = {1, 2, 3, 4, 5};
		int len = num_list.length; //5
        int[] result = new int[len];
        for(int a = len-1, b = 0; b < len; a--, b++) {
            result[a] = num_list[b];
        }
        System.out.println(result);
    }
}
