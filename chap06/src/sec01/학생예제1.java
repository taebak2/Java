package sec01;

public class 학생예제1 {

	public static void main(String[] args) { // 실행 클래스
		Student s1 = new Student(); // Student 클래스에 s1 인스턴스 생성
		Student s2 = new Student(); // Student 클래스에 s2 인스턴스 생성
		
		//s1.age; 필드나 메소드를 이용 가능
		//s1.setAge(40);

		if (s1 == s2) {
			System.out.println("같은 참조");
		} else {
			System.out.println("다른 참조");
		}
	}

}
