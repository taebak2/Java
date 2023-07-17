package sec05;

public class Person {
	final String NATION = "korea";
	final String SSN; // final 값 쓸 때는 대문자로 쓰기, 상수값 설정할 때 사용
	String name;

	public Person(String ssn, String name) {
		this.SSN = ssn;
		this.name = name;
	}

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "홍길동");

		System.out.println(p1.NATION);
		System.out.println(p1.SSN);
		System.out.println(p1.name);

		// p1.NATION="USA"; final 객체는 변경 안됨
	}

}
