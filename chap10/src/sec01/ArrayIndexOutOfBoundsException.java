package sec01;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {

		String[] a = new String[10];

		a[0] = "������";
		String data1 = a[0];
		System.out.println("a[0]:" + data1);

		String data2 = args[0]; // args��� �迭�� �������� �ʰ� �迭�� �ִ� ���� ������
		String data3 = args[1]; // �̴�� ����ϸ� ArrayIndexException �߻�(�迭���� �ε��� ���� �ʰ��� ����)
		String data4 = args[2];
		System.out.println(data2);
		System.out.println(data3);
		System.out.println(data4);
	}

}
