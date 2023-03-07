package ch07.review;

public class review {
	public static void main(String[] args) {
		Animal a1 = new Animal();
		
//		a1.method1();
//		a1.method2();
		
		Animal a2 = new Horse();
		a2.method1();
		System.out.println();
	}
}

 sealed class Animal permits Horse, Fish, Dog {
	 Animal() {} //기본 생성자
	 
	 public void method1() {
		 System.out.println("동물 메소드1 실행");
	 }
	 
	 public void method2() {
		 System.out.println("동물 메소드2 실행");
	 }
 }

 final class Horse extends Animal {
	 
	 @Override
	public void method1() {
		System.out.println("말 오버라이딩 메소드1 실행");
		method1();
		super.method1();
		method2();
	}
 }
 
 non-sealed class Fish extends Animal{
	 Fish() {
		 
	 }
 }
 
 sealed class Dog extends Animal permits Cat{
	 Dog() { //기본생성자
		 
	 }
 }
 
 final class Cat extends Dog{
	 //상위클래스인 Dog가 기본생성자라 굳이 안써도 된다
 }
 
 