package sec03;

public class AnimalExample {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
// 		Animal animal = new Animal();  �߻� Ŭ������ ��ü ���� �Ұ���
		dog.sound();
		cat.sound();

		Animal animal  = new Dog(); // �ڵ� Ÿ�� ��ȯ
		animal.sound(); // �������̵��� dog�� �޼ҵ� ȣ��
		
		animalSound(new Dog()); // 20��° �� animalSound�� �޼ҵ� (Animal animal) {animal.sound();}�� �ҷ���
	}

	//�Ű������� Animal Ÿ���� �޼ҵ�
	public static void animalSound(Animal animal) { 
		animal.sound();
	}
	
	
}
