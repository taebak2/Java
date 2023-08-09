package sec01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 학생ArrayList {

	public static void main(String[] args) {
		Student[] student = new Student[4];
		List<Student> list = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		System.out.println("학생 이름, 학과, 학번, 학점 평균 입력하세요.");
		for (int i = 0; i < student.length; i++) {
			System.out.print(">> ");
			String name = s.next();
			String department = s.next();
			String number = s.next();
			double grade = s.nextDouble();
			student[i] = new Student(name, department, number, grade); // 배열에 클래스를 저장 , 
																	   // new Student 클래스에 생성자 임의로 만들어야 이렇게 받을 수 있음
			list.add(student[i]); // 클래스를 저장한 배열을 ArrayList에 저장
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println("-----------------------------------------");
			Student stu = list.get(i); // 학생 정보가 저장 된 Arraylist를 stu에 저장 
			System.out.println("이름: " + stu.getName());
			System.out.println("학과: " + stu.getDepartment());
			System.out.println("학번: " + stu.getNumber());
			System.out.println("학점평균: " + stu.getGrade());
		}
		System.out.println("-----------------------------------------");
		
		while(true) {
			System.out.println("학생 이름 >> ");
			String name = s.next();
			if(name.equals("그만")) 
				break;
				for (int i = 0; i < list.size(); i++) {
					Student stu = list.get(i);
					stu.find_student(name);
				}
			}
		}
	}


