package common;

public class Person {
	private String name; // 멤버 변수는 private 선언
	private int age;

	public Person() { // 기본 생성자
	}

	// getter, setter 메소드는 public으로 생성

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

}
