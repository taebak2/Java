package sec01;

public class Student { // public class Student = ���̺귯��(API) Ŭ����
	// �л��� ���� �ִ� �Ӽ�(�ʵ�)
	int age; // ����
	String gender; // ����
	String name; // �̸�

	public Student() { // Student�� ������, ��ü ������ �ʱ�ȭ 
		
	}

	public int getAge() { // get�� �������� ��, set�� ����ִ� �� == �޼ҵ�
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGendar() {
		return gender;
	}

	public void setGendar(String gendar) {
		this.gender = gendar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*public int setAge(int age) { // �޼ҵ�, setAge = ���̸� ����
 		return age;
	}*/
}
