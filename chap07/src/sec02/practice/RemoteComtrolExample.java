package sec02.practice;

public class RemoteComtrolExample extends RemoteControl{

	public static void main(String[] args) {
		RemoteControl rc = new AirControl(); // ������ ������(�ڽ�)�� ������(�θ�)�� ����
		rc.powerOn(); // �������̵�� �޼ҵ常 ��밡�� + �������̵� �޼ҵ带 �ҷ���
		AirControl c = (AirControl)rc; // �ڽ� Ŭ������ �ٽ� �θ� Ŭ������ ...??
		

	}

}
