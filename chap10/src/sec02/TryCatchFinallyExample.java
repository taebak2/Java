package sec02;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try { // try = ���� ���� ���� ����Ǹ� catch ��� �ڵ� ���� X, ���� �߻��ϸ� ���� ����
			Class clazz = Class.forName("java.lang.String"); // �ڹ� ���� ��Ʈ���� �ֳ���?
		} catch (ClassNotFoundException e) { // ����ó�� 
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		} finally {// finally = ������ ����
			System.out.println("���� ó�� �Ǿ����ϴ�."); 
		}

	}

}
