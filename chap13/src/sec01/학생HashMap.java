package sec01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class �л�HashMap {

	public static void main(String[] args) {
		Student[] student = new Student[4];
		Map<String, Student> map = new HashMap<>();

		Scanner s = new Scanner(System.in);
		System.out.println("�л� �̸�, �а�, �й�, ���� ��� �Է��ϼ���.");
		for (int i = 0; i < student.length; i++) {
			System.out.print(">> ");
			String name = s.next();
			String department = s.next();
			String number = s.next();
			double grade = s.nextDouble();
			student[i] = new Student(name, department, number, grade);
			map.put(name, student[i]);
		}
		Set<String> keySet = map.keySet(); // key Set ���
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			System.out.println(map.get(key).getName()); // Ű�� ���� �� ���
			System.out.println(map.get(key).getDepartment()); // Ű�� ���� �� ���
			System.out.println(map.get(key).getNumber()); // Ű�� ���� �� ���
			System.out.println(map.get(key).getGrade()); // Ű�� ���� �� ���
		}

		System.out.println("-----------------------------------------");
		while (true) {
			System.out.println("�л� �̸� >> ");
			String name = s.next();
			if (name.equals("�׸�"))
				break;
				Student stu = map.get(name);
				stu.find_student(name);
		}

	}

}
