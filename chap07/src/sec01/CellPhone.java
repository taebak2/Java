package sec01;

public class CellPhone {
	String model;
//private String model; DmbCellPhone���� ��ӹޱ� ���ؼ� getter, setter�� �̿��ؾ��Ѵ�.
	String color;
	
	// default ���� ��Ű���� ��� ��� ���� �ڽ��� ��쿡�� ��� ����
	
	// ������
	
	// �޼ҵ�
	
	void powerOn() {System.out.println("������ �մϴ�.");}
	void powerOff() {System.out.println("������ ���ϴ�.");}
	void bell() {System.out.println("���� �︳�ϴ�.");}
	void sendVoice(String message) {System.out.println("�ڱ� : " + message);}
	void receiveVoice(String message) {System.out.println("���� : " + message);}
	void hangUp() {System.out.println("��ȭ�� �����ϴ�");}

}
