package sec03;

public class Student����1 {

	public static void main(String[] args) {
		Student Student = new Student(); // Student(�Ķ���) = Ŭ����, Student Ŭ������ ����, new Student ��ü 
		System.out.println(Student.name);
		System.out.println(Student.age);

		System.out.println("------------------");
		
		Student Student2 = new Student("ȫ����",30);
		
		System.out.println(Student2.name);
		System.out.println(Student2.age);
		
		System.out.println("------------------");
		
		
		Student Student3 = new Student("ȫ�浿",20231111,"010-5555-7777");
		System.out.println(Student3.name);
		System.out.println(Student3.classNumber);
		System.out.println(Student3.number);
	}

}
