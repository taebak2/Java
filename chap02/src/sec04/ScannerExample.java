package sec04;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputData;

		while (true) {
			inputData = scanner.nextLine(); 							 // nextLine : ���ڿ� ������ ��°�� �ν�
			System.out.println("�Էµ� ���ڿ� : \"" + inputData + "\""); // "\*"�� ������ ������ Ư������ �Է½� Ư�����ڸ� ���
			if (inputData.equals("q")) { 								 // ����(int, short, char, long, float, double)�� �� == , ���ڿ�(ex:String)�� equals�� ���� ��
																		
				break;
			}

		}
		System.out.println("����");
	}

}
