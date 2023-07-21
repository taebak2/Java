package sec02;

public class TryCatchFinallyExample3 {

	public static void main(String[] args) {

		try {
			//String data1 = args[0]; case 1: ArrayIndexOutOfBoundsException(���� �Ű����� ������ �� �߻��ϴ� ����)
			//String data2 = args[1];
			
			//String data1 = "����"; // case 2: NumberFormatException(���� ���� ����)
			//String data2 = "�ٶ�";
			
			String data1 = "123"; // case 3: try ���� ���� 
			String data2 = "456";
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println("�� ���� ���� : " + result);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �Ű������� �����մϴ�.");
		} catch (NumberFormatException e) {
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�.");
		} finally {
			System.out.println("�ٽ� �����ϼ���.");
		}
	}

}
