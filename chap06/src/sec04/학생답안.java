package sec04;

public class �л���� {
//String gender depcode String int score ������ ����� source �޼ҵ�void start, end�� ȣ��  
	String gender;
	String depCode;
	int score;

	public �л����(String gender, String depCode, int score) { // ������ �����
		this.gender = gender;
		this.depCode = depCode;
		this.score = score;
	}

	void start() {
		System.out.println("���� : " + gender);
		System.out.println("�а��ڵ� : " + depCode);
		System.out.println("���輺�� : " + score);
		String grade = end(score); // String end������ int�� 77�϶� ó��~
		System.out.println("����� ������ : " + grade);
	}

	String end(int x) { // ��� String end���� String�̶� ()�� �ȿ� ���� ���� ������ �޶� �������
		String result;
		if (x >= 90) { 
			result = "A";
		} else if (x >= 80) {
			result = "B";
		} else if (x >= 70) {
			result = "C";
		} else {
			result = "F";

		}
		return result;
	}
}
