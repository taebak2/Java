package chap12;

import java.awt.Toolkit; // ���� �ü���� ������ ���� ��ȸ�� �� �ִ� ����

public class BeepPrintExample {

	public static void main(String[] args) {

		Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit ��ü ���
		for (int i = 0; i < 5; i++) {
			toolkit.beep(); // ������ �߻�
			try {Thread.sleep(500);} catch (Exception e) {}
				//Thread.sleep(500) : 0.5�ʰ� �Ͻ����� 
			}
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("��");
			try {Thread.sleep(500);} catch (Exception e) {}
			}
	}

}
