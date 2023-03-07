package ch07.lecture.p02polymorphism;

public class C09Polymorphism {
	public static void main(String[] args) {
		Weapon o1 = new Gun();
		Weapon o2 = new Bow();
		Weapon o3 = new Sword();
		
		Gun[] o4 = new Gun[3];
		//클래스 타입으로 된 o4라는 배열을 만들었다. 배열의 길이는 요소 3개이다
		//클래스 타입을 바탕으로 실행된다
		o4[0] = new Gun();//바탕이 총이고 그안에 총은 들어갈 수있다(자기자신이니까)
		o4[1] = new Weapon(); //바탕이 자식인데 그 바탕으로 부모가 실행 될 수는 없다
		o4[2] = new Bow();  //자식에게 상속받을 수 없으니까
		
		o4[0].attack();
		o4[1].attack();
		o4[2].attack();
		
		Weapon[] o5 = new Weapon[5];
		//부모요소가 바탕으로 된 배열이다
		o5[0] = new Weapon(); //자기 자신도 되고
		o5[1] = new Gun(); //자식들도 들어갈 수 있다 부모를 바탕으로 자식에게 상속할 수 있으니까
		o5[2] = new Bow();
		o5[3] = new Sword();
		
		o5[0].attack();
		o5[1].attack();
		o5[2].attack();
		o5[3].attack();
	}
}
