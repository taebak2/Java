package sec02;

public class StudentA {

	Person person = new Person() { // �ʵ尪���� �͸� ��ü ���� 
		void work() {
			System.out.println("��մϴ�.");
		}

		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
		}
	};

	//  StudentA �ȿ� ��ø Ŭ����(�ν��Ͻ�) StudentB ����
	class StudentB {
		String name;
		int age;

		void sleep() {
			System.out.println("���� ��ϴ�.");
		}
	}

	void method1() {

		// �޼ҵ� �͸� ��ü
		Person localVar = new Person() {
			void walk() {
				System.out.println("��å�մϴ�.");
			}

			@Override
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk(); // ���⼭ walk�� �� �θ��� Person Ŭ���� �ȿ� walk�� ���� ������ walk������ �ȵ˴ϴ�.
			}
		};

		localVar.wake(); // �޼ҵ� �͸� ��ü�� ��ü ���� ���Ŀ� �� ������ ������Ѵ�!
	}

	void method2(Person person) { // Person Ŭ������ wake �ֱ� ������ ���డ��
		person.wake();
	}
}
