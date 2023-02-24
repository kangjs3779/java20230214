package ch05.lecture.p05null;

public class C01Null {
	public static void main(String[] args) {
		int[] arr1 = new int[] {1, 2};
		//arr1은 객체 값을 저장한 주소를 가지고 있는데
	
		arr1 = null;
		//참조하는 객체 없음
		//null이라는 값으로 대체되었다
		//참조하는 정보가 사라짐
		//저장된 값은 떠도는 instance가 되었을 뿐 삭제된 것은 아님
		//근데 참조할 값이 없어졌으므로 이 instance는 사용할 수 없는 값이 되어서 = garbage라고 함
		//이러한 쓰레기는 자바 자체에서 garbage collector가 자동으로 제거함
		//크게 신경을 안써도 된다
		
		int len = arr1.length;
		int val = arr1[0];
		
		System.out.println(len);
		System.out.println(val);
		//실행이 되지 않는다
		//arr1의 값이 null인데도 길이와 값을 읽으려고 해서 오류야!!라고 뜬다
		//참조 없음 예외 발생 = NullPointerException
		
	}
}
