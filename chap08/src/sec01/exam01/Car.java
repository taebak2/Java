package sec01.exam01;

public interface Car {
	// �������̽��� ��� �ʵ�� �߻� �޼ҵ常 ��� ������
	
	int MIN_SPEED = 0;
	int MAX_SPEED = 200;
	
	// ��� �ʵ�� public static final �ڵ����� ����
	
	void speedUp(int speed);
	void speedDown(int speed);

	// �߻� �޼ҵ� public abstract�� �ڵ����� ����
}
