package sec02;

public class �迭����1 {

	public static void main(String[] args) {
		int[] oldIntArray = { 1, 2, 3 };
		int[] newIntArray = new int[5];

		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}

		for (int i = 0; i < newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", "); // new intArray�� �迭�� 5���ε� oldInt�� 3���ϱ� ������ 4,5�� �ڸ��� 0���� ó��...
			if (i < newIntArray.length - 1) {
				System.out.println(newIntArray[i] + ",");
			} else {
				System.out.println(newIntArray[i]);
			}
		}

	}

}
