package sec01;

public class ClassCastExceptionExample {

	public static void main(String[] args) {

		Animal animal = new Dog();
		Dog dog = (Dog) animal;
		changeDog(dog);

		Animal animal2 = new Dog();
		Cat cat = (Cat) animal2; // java.lang.ClassCastException ���� Cat��ü�� �Ű������� �༭ Dog Ÿ������ ��ȯ X
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