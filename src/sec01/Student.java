package sec01;

public class Student { // public class Student = 라이브러리(API) 클래스
	// 학생이 갖고 있는 속성(필드)
	int age; // 나이
	String gender; // 성별
	String name; // 이름

	public Student() { // Student의 생성자, 객체 생성시 초기화 
		
	}

	public int getAge() { // get은 가져오는 것, set은 집어넣는 것 == 메소드
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

	/*public int setAge(int age) { // 메소드, setAge = 나이를 설정
 		return age;
	}*/
}
