package sec02;

public class StudentAExmaple {

	public static void main(String[] args) {

		// StudentB ��ü �����ϼ���
		StudentA a = new StudentA(); // static�� ���� ������ �ʱ� ���� �ʿ�
		StudentA.StudentB b = a.new StudentB();
		// ��� 2 : StudentA.StudentB b= new StudentA().new StudentB(); // A.B b = new
		// A.new B

		b.name = "��ö��";
		b.age = 22;
		b.sleep();

		a.person.wake();
		// a.person.work(); // person ��ü�� work �޼ҵ尡 ���� �� work�� �������̵�� �޼ҵ尡 �ƴ�
		a.method1();

		// method2�� �Ű������� Person Ŭ���� Ÿ���� �Ѱ���� ��
		// �Ű������� �������� ; ������
		a.method2(new Person() {
			void study() {
				System.out.println("�����մϴ�.");
			}

			@Override
			void wake() {
				System.out.println("8�ÿ� �Ͼ�ϴ�.");
				study();
				// �������̵� �ȵ� �޼ҵ�(study)�� ȣ���� �ȵǱ� ������
				// �������� �޼ҵ带 ȣ����
			}
		}

		);
	}
}
