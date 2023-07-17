package sec03;

public class AnimalExample {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
// 		Animal animal = new Animal();  추상 클래스는 개체 생성 불가능
		dog.sound();
		cat.sound();

		Animal animal  = new Dog(); // 자동 타입 변환
		animal.sound(); // 오버라이딩된 dog의 메소드 호출
		
		animalSound(new Dog()); // 20번째 줄 animalSound의 메소드 (Animal animal) {animal.sound();}을 불러옴
	}

	//매개변수가 Animal 타입인 메소드
	public static void animalSound(Animal animal) { 
		animal.sound();
	}
	
	
}
