package sec01;

public class Outter {
	String name = "ȫ�浿";

	void reName() {
		System.out.println("ȫ�浿 �̸� �����մϴ�.");
	}

	class Nested { // �ν��Ͻ� �ʵ� 
		String name = "�嵿��";

		void reName() {
			System.out.println("�嵿�� �̸� �����մϴ�.");
		}

		void print() {
			System.out.println(this.name);
			System.out.println(Outter.this.name);
		}
	}

}
