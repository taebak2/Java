package sec01;

public class MyPointExample {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);
		System.out.println(p); // My Point Ŭ������ p ��ü�� ȣ���ϸ�
							   //object���� toString ȣ��(�ؽ��ڵ�) ���� �ֻ��� Ŭ����object���� toString���� ������
							   // MyPoint Ŭ������ toString�� �������̵� �߱� ������ �������̵尪�� ���� 
		if (p.equals(q))
			System.out.println("���� ��");
		else
			System.out.println("�ٸ� ��");
	}

}
