package sec01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// DmbCellPhone ��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);

		// CellPhone Ŭ�����κ��� ��ӹ��� �ʵ�
		System.out.println("��: " + dmbCellPhone.model); // ��ӹ��� �ʵ� ���
		
		System.out.println("����: " + dmbCellPhone.color); 

		// DmbCellPhone Ŭ������ �ʵ�
		System.out.println("ä��: " + dmbCellPhone.channel);

		// CellPhone Ŭ�����κ��� ��ӹ��� �޼ҵ� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell(); // ��ӹ��� �޼ҵ� ���
		dmbCellPhone.sendVoice("��������.");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���.");
		dmbCellPhone.sendVoice("��~ �� �ݰ����ϴ�.");
		dmbCellPhone.hangUp();

		// DmbCellPhone Ŭ������ �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb(); // �ڱ� �޼ҵ� ���
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();

	}

}
