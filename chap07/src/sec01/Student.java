package sec01;

public class Student extends Human {
	int studentCode; // �й�
	String studentDept; // �а�

	Student(int weight, int height, int studentCode){
		super(weight, height);
		this.studentCode = studentCode;
	}
//	
//	Student(int studentCode, String gender, int height) { // ������
//		
//		this.studentCode = studentCode;
//		this.gender = gender; // ��ӹ��� �ʵ�
//		this.height = height; // ��ӹ��� �ʵ�
//	}

	void study(String place) { // String place �Է½� ���� �Է� ���� ���ص� �ٷ� ��밡��..?
		System.out.println(place + "���� �����մϴ�.");
	}

	void dressOn() {
		System.out.println("������ �Խ��ϴ�.");
	}

	void dressOff() {
		System.out.println("������ �����ϴ�.");
	}

	@Override
	String eat(String food) {
		String result = food + "�� ���� �Ծ��";
		return result;
	}
	
}
