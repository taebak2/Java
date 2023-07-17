package sec01.verify.exam04;

public class Parent {
	public String nation;

	public Parent() {
		this("대한민국");
		System.out.println("Pareint() call");
	}

	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}

	// 부모 클래스의 생성자를 별도로 만듦
//	public Parent(String name) {
	// this.name = name;
//	}

}
