package sec02;

public class Ȯ�ι���4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i]; // max �ִ밪 ���ϴ¹��
			}
		}
		System.out.println("�ִ밪 : " + max);

	}

}
