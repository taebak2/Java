package sec04;

public class �л� {
//String gender depcode String int score ������ ����� source �޼ҵ�void start, end�� ȣ��  
	String gender;
	String depCode;
	int score;

	public �л�(String gender, String depCode, int score) { // ������ �����
		this.gender = gender;
		this.depCode = depCode;
		this.score = score;
	}
 // ������ �ѹ��� ���� ���� ���� �ʿ����...
	
	int score(int x) { // ���輺��
		int result = x;
		return result;
	}

	String depCode(String a) { // �а�
		String result = a;
		return result;
	}

	String gender(String b) { // ����
		String result = b;
		return result;
	}

	void start() {
		int result = score(90);
		if (result >= 90) {
			end();
		}
		int result1 = score(80);
		if (result1 >= 80) {
			end();
		}
		int result2 = score(70);
		if (result2 >= 70) {
			end();
		} else {
			end();
		}

	}

	String end() { // ���

		System.out.println("A");

		System.out.println("B");

		System.out.println("C");

		System.out.println("D");
		return end();
	}

}
