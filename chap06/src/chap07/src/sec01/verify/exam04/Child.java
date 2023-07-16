package sec01.verify.exam04;

public class Child extends Parent {

	private int studentNo;
	private String name;

	public Child(String name, int studentNo) {
		// this.name=name; 부모꺼 상속을 해야하기 때문에 super를 써야한다.
		super(name);
		this.studentNo = studentNo;

	}

	public Child() {
		this("홍길동");
		System.out.println("Child() call");
	}

	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
