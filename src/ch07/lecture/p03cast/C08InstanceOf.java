package ch07.lecture.p03cast;

public class C08InstanceOf {
	public static void main(String[] args) {
		Super08 o1 = new Super08();
		boolean b1 = o1 instanceof Sub08 o2;
		System.out.println(b1);
//		if(o1 instanceof Sub08) {
//			Sub08 o2 = (Sub08) o1;
//		}
//		
//		if(o1 instanceof Sub08 o2) {
//			//더 쉽게쓰는 문법
//			//pattern matching for instanceOf
//		}
	}
}

class Super08 {}
class Sub08 extends Super08{}
