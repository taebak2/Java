package sec05;

public class Person {
	final String NATION = "korea";
	final String SSN; // final �� �� ���� �빮�ڷ� ����, ����� ������ �� ���
	String name;

	public Person(String ssn, String name) {
		this.SSN = ssn;
		this.name = name;
	}

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "ȫ�浿");

		System.out.println(p1.NATION);
		System.out.println(p1.SSN);
		System.out.println(p1.name);

		// p1.NATION="USA"; final ��ü�� ���� �ȵ�
	}

}
