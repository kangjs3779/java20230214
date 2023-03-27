package ch12.lecture.p05reflection;

public class C01Reflection {
	public static void main(String[] args) throws Exception {
		//reflection : 클래스에 관한 정보를 얻고 싶을 때 
		//클래스 정보를 가진 객체 생성
		//세가지가 있음
		
		Class<String> class1 = String.class; //1. 클래스의 .class 속성으로 얻기
		//<>는 해도되고 안해도 된다
		
		Class class2 = (Class<String>) Class.forName("java.lang.String"); //2. forName static method로 얻기
		
		String s1 = "java";
		Class<String> class3 = (Class<String>) s1.getClass(); //3. 객체로부터 얻기
		
		//이게 어떤일을 한다는게 중요하지 과정은 그렇게 중요하지 않음
		//3개 모두 같은 객체임
		
		System.out.println(System.identityHashCode(class1));
		System.out.println(System.identityHashCode(class2));
		System.out.println(System.identityHashCode(class3));
		//같은 객체임을 확인할 수 있다
		
		
	}
}
