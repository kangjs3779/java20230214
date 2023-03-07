package ch08.review;

public class review01 {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		Pet pet = dog1;
		Dog dog2 = pet;
		
		Pet p = new Pet();
	}
}


class Dog implements Pet, Animal{
	
	@Override
	public void hand() {
		System.out.println("오른손을 준다");
	}
}

class Wolf {}

class Cat implements Pet{
	@Override
	public void hand() {
		System.out.println("왼손을 준다");
	}
}

class Tiger {}
