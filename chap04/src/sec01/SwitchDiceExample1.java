package sec01;

import java.util.Scanner;

public class SwitchDiceExample1 {

	public static void main(String[] args) {

		int time = (int) (Math.random() * 4) + 8; // 8~ 11 �� �ϳ��� ���� �̱�

		switch (time) {
		case 8:
			System.out.println("8 : ����մϴ�");
			break;
		case 9:
			System.out.println("9 : ȸ�Ǹ� �մϴ�");
			break;
		case 10:
			System.out.println("10 : ������ ���ϴ�");
			break;
		case 11:
			System.out.println("11 : �ܱ��� �����ϴ�");
			break;

		}
	}

}
