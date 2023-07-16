package sec03;

public class Student예제1 {

	public static void main(String[] args) {
		Student Student = new Student(); // Student(파랑색) = 클래스, Student 클래스의 변수, new Student 객체 
		System.out.println(Student.name);
		System.out.println(Student.age);

		System.out.println("------------------");
		
		Student Student2 = new Student("홍수아",30);
		
		System.out.println(Student2.name);
		System.out.println(Student2.age);
		
		System.out.println("------------------");
		
		
		Student Student3 = new Student("홍길동",20231111,"010-5555-7777");
		System.out.println(Student3.name);
		System.out.println(Student3.classNumber);
		System.out.println(Student3.number);
	}

}
