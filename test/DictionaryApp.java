package test;


public class DictionaryApp {
	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10); // �迭 
		dic.put("ȫ�浿", "�ڹ�");
		dic.put("��浿", "���̼�");
		dic.put("��浿", "C"); // ��浿�� ���� C�� ����
		System.out.println("ȫ�浿�� ���� " + dic.get("ȫ�浿"));
		System.out.println("��浿�� ���� " + dic.get("��浿"));
		dic.delete("ȫ�浿"); // ȫ�浿 ������ ����
		System.out.println("ȫ�浿�� ���� " + dic.get("ȫ�浿")); // ������ ������ ����
	}

}
