package sec01;

public interface RemoteControl {
	// public int s = 3;
	// �������̽� �ʵ� �ùٸ� ��� ����� �ƴ�
	// �������̽� �ʵ�� ��� �ʵ常 ��� �����ϹǷ�
	// �ʵ� �̸��� �빮�ڷ� ���� ���� ����
	// �������̽� ����� �ݵ�� ����� ���ÿ� �ʱⰪ�� ��������� �Ѵ�.
	// public String NAME;
	// �������̽� ��� �ʵ�� ��� public static final�� Ư���� ���´�.(������ �������� �ڵ����� �ٴ´�.)
	// �������̽��� ����� �߻� �޼ҵ�� ��� public abstract�� Ư���� ���´�. (������ �������� �ڵ����� �ٴ´�.)

	public int MIN_VOLUME = 0; 
	public int MAX_VOLUME = 10;
	public String NAME = "ȫ�浿";

	void turnOn();

	void turnOff();

	public void setVolume(int volume);
	// �������̽� �޼ҵ�� �߻� �޼ҵ�� ������
}
