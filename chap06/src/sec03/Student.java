package sec03;

public class Student { // field 클래스 이름이랑 생성자 이름, Main 실행문의 클래스, 객체 값이 일치해야한다.
						// 	source 들어가서 필드를 이용한 생성자 생성 가능
	// 필드
	String name;
	int age;
	int classNumber;
	String gender;
	String number;

	// 생성자
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
