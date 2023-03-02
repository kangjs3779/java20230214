package ch06.lecture.p07constructor;

public class C03Construnctor {
	public static void main(String[] args) {
		MyClass03 o1 = new MyClass03();
		o1.name = "kang";
		o1.age = 66;
		MyClass03 o2 = new MyClass03();
		o2.name = "park";
		o2.age = 54;
		MyClass03 o3 = new MyClass03();
		
		
		o1.descript();
		o2.descript();
		o3.descript();
	}
}
