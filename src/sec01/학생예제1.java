package sec01;

public class �л�����1 {

	public static void main(String[] args) { // ���� Ŭ����
		Student s1 = new Student(); // Student Ŭ������ s1 �ν��Ͻ� ����
		Student s2 = new Student(); // Student Ŭ������ s2 �ν��Ͻ� ����
		
		//s1.age; �ʵ峪 �޼ҵ带 �̿� ����
		//s1.setAge(40);

		if (s1 == s2) {
			System.out.println("���� ����");
		} else {
			System.out.println("�ٸ� ����");
		}
	}

}
