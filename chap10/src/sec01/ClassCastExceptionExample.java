package sec01;

public class ClassCastExceptionExample {

	public static void main(String[] args) {

		Animal animal = new Dog();
		Dog dog = (Dog) animal;
		changeDog(dog);

		Animal animal2 = new Dog();
		Cat cat = (Cat) animal2; // java.lang.ClassCastException 오류 Cat객체를 매개값으로 줘서 Dog 타입으로 변환 X
		changeDog(cat);
	}

	public static void changeDog(Animal animal) {
		// if(animal instanceOf Dog) {
		Dog dog = (Dog) animal;

		// }

	}
}

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}