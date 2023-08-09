package sec01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class 학생HashMap {

	public static void main(String[] args) {
		Student[] student = new Student[4];
		Map<String, Student> map = new HashMap<>();

		Scanner s = new Scanner(System.in);
		System.out.println("학생 이름, 학과, 학번, 학점 평균 입력하세요.");
		for (int i = 0; i < student.length; i++) {
			System.out.print(">> ");
			String name = s.next();
			String department = s.next();
			String number = s.next();
			double grade = s.nextDouble();
			student[i] = new Student(name, department, number, grade);
			map.put(name, student[i]);
		}
		Set<String> keySet = map.keySet(); // key Set 얻기
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			System.out.println(map.get(key).getName()); // 키에 대한 값 얻기
			System.out.println(map.get(key).getDepartment()); // 키에 대한 값 얻기
			System.out.println(map.get(key).getNumber()); // 키에 대한 값 얻기
			System.out.println(map.get(key).getGrade()); // 키에 대한 값 얻기
		}

		System.out.println("-----------------------------------------");
		while (true) {
			System.out.println("학생 이름 >> ");
			String name = s.next();
			if (name.equals("그만"))
				break;
				Student stu = map.get(name);
				stu.find_student(name);
		}

	}

}
