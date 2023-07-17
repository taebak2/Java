package sec01.verify.exam04;

public class Child extends Parent {

	private int studentNo;
	private String name;

	public Child(String name, int studentNo) {
		// this.name=name; �θ� ����� �ؾ��ϱ� ������ super�� ����Ѵ�.
		super(name);
		this.studentNo = studentNo;

	}

	public Child() {
		this("ȫ�浿");
		System.out.println("Child() call");
	}

	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
