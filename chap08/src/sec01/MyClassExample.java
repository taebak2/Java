package sec01;

public class MyClassExample {

	public static void main(String[] args) {

		MyClass my1 = new MyClass();
		// ����Ʈ ������ ȣ��
		my1.rc.turnOn();
		my1.rc.setVolume(7);
		//��°� 2��
		
		MyClass my2 = new MyClass(new Television()); // Television(�Ű����� ����)
		my2.rc.turnOn();
		my2.rc.setVolume(7);
		// ��°� 6��
		
		MyClass my3 = new MyClass(new Audio()); // �Ű������� �����(�Ű����� ����) �־���
		my3.rc.turnOn();
		my3.rc.setVolume(7);
		//��°� 6��
		
		MyClass my4 = new MyClass(); 
		my4.methodA();
		//��°� 3��
		
		MyClass my5 = new MyClass();
		my5.methodB(new Television());
		// �Ű������� �ִ� �޼ҵ� ȣ��(Television ȣ��)
		//��°� 3��
		
	}

}
