package sec01.exam02;

public class Student extends People{
	public int studentNo; // �й�
	
	public Student(String name, String ssn,int StudentNo) {
		super(name,ssn); // �θ� ������ ȣ��, �ƹ��͵� �� ������ defalut �⺻���� ȣ�� but �⺻�� ���� ���߱� ������ ������ ���. �׷��� super�� �Է��������
		this.studentNo = studentNo;
	}

}
