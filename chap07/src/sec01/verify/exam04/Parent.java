package sec01.verify.exam04;

public class Parent {
	public String nation;

	public Parent() {
		this("���ѹα�");
		System.out.println("Pareint() call");
	}

	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}

	// �θ� Ŭ������ �����ڸ� ������ ����
//	public Parent(String name) {
	// this.name = name;
//	}

}
