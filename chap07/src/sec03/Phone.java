package sec03;

//�߻� Ŭ����
public abstract class Phone {
	public String owner; // ������ �ʵ�

	public Phone(String owner) { // ������
		this.owner = owner;
	}

	// ���� X, �Ű����� X, �޼ҵ�
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}

	// ���� X, �Ű����� X, �޼ҵ�
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}
}
