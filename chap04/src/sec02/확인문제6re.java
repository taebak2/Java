package sec02;

public class Ȯ�ι���6re {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) { //�� 4�� ���� ���� 
			for (int j = 4; j >= 1; j--) { //  j�� 4,3,2,1 �� 4�� ���� + ����: 4�� 1 ���� ������(true) ���� 1��.. �ٵ� 4> (1,2,3,) 3������ i�� j�� ���ų� �ٸ��ϱ� �� ���  
				if (i < j) {	
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
