package sec06;

import java.util.Scanner;

public class Student {
	private String name = "ȫ�浿"; // �л� �̸�
	private String code = "A123"; // �й�
	private int middleScore; // �߰���� ����
	private int finalScore; // �⸻��� ����
	private double avg; // �������

	final String id = "admin";
	final int password = 1234;

	Scanner s = new Scanner(System.in);

	public boolean checkLogin() {
		
		System.out.println("���̵� �Է��ϼ���");
		String ID = s.next();
		System.out.println("��й�ȣ�� �Է��ϼ���");
		int pw = s.nextInt();
		
		if (this.id.equals(ID) && this.password == pw) {
			return true;
		} else {
			return false;
		}
	}

	public void inputExam() {
		System.out.println("�߰���� ������ �Է��ϼ���");
		setMiddleScore(s.nextInt());
		System.out.println("�⸻��� ������ �Է��ϼ���");
		setFinalScore(s.nextInt());
		double avg = (getMiddleScore() + getFinalScore()) / 2;
		setAvg(avg);
		System.out.println("��� ������" + getAvg());

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getMiddleScore() {
		return middleScore;
	}

	public void setMiddleScore(int middleScore) {
		this.middleScore = middleScore;
	}

	public int getFinalScore() {
		return finalScore;
	}

	public void setFinalScore(int finalScore) {
		this.finalScore = finalScore;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

}
