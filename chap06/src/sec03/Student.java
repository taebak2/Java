package sec03;

public class Student { // field Ŭ���� �̸��̶� ������ �̸�, Main ���๮�� Ŭ����, ��ü ���� ��ġ�ؾ��Ѵ�.
						// 	source ���� �ʵ带 �̿��� ������ ���� ����
	// �ʵ�
	String name;
	int age;
	int classNumber;
	String gender;
	String number;

	// ������
	public Student() {
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Student(String name, int classNumber, String number) {
		this.name = name;
		this.classNumber = classNumber;
		this.number = number;
	}



}
