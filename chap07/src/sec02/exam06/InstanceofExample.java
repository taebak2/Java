package sec02.exam06;

public class InstanceofExample {

	public static void main(String[] args) {
		Parent parentA = new Child(); // child�� parent�� ���
		method1(parentA);

		Parent parentB = new Parent();
		method1(parentB);
	}

	public static void method1(Parent parent) {

		if (parent instanceof Child) { // ���� Ÿ�� ��ȯ �� instanceof �����ڷ� �˻��ϴ� ���� ����
			Child child = (Child) parent; // child�� parent�� ��ӽ��ױ� ������ ��������ȯ ����
			System.out.println("���� ��ȯ ����");
		} else {
			System.out.println("���� ��ȯ ����");

		}
	}

}
