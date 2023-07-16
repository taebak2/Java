package sec01.exam02;

public class Student extends People{
	public int studentNo; // 학번
	
	public Student(String name, String ssn,int StudentNo) {
		super(name,ssn); // 부모 생성자 호출, 아무것도 안 적으면 defalut 기본값을 호출 but 기본값 생성 안했기 때문에 에러가 뜬다. 그래서 super를 입력해줘야함
		this.studentNo = studentNo;
	}

}
