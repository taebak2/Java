package sec06;

import java.util.Scanner;

public class Car {
	private String Name;
	private String company;
	private String color;
	private int speed=50;
	
Scanner a = new Scanner(System.in);


	public String getColor() {
		return color;
	}

	public void setColor() {
		System.out.println("������ �Է��ϼ���");
		String c = a.next(); // ������ �����������
		color = c; // ������ c�� �ٲ�
		System.out.println("����� ���� : " + getColor());
		
		
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed() { // setSpeed�ȿ� ������ �Է¾��ص��ǰ�, ���� �Է��� �ÿ� ���� Ÿ�����θ� ��� �����ϴ� 
		int carSpeed = getSpeed(); // ���� ����
	
		System.out.println("Ű�� �����ּ��� a�� �ӵ� ���� s�� �ӵ� ����");
		String key = a.next();
		System.out.println("�ӵ��� �Է����ּ���");
		int changeSpeed = a.nextInt();
		int presentSpeed = getSpeed();
		
		if (key.equals("s") && presentSpeed<changeSpeed) {
			System.out.println("�ӵ��� ���̳ʽ��� �� �� �����ϴ�.");
		} else if (key.equals("s") && presentSpeed>=changeSpeed) {
			speed -= changeSpeed;
			System.out.println("����ӵ� : " + getSpeed());
		} else {
			speed += changeSpeed;
			System.out.println("���� �ӵ� : " + getSpeed());
		}
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) { // ���� company
		
		this.company = company; // this. = public class Car�� ����� ���� String company.... 
		// Carexample���� ���� �޾ƿ��� ���ؼ��� car.setCompany ���� �����Ű�� ���ؼ��� ������ �ʿ�
	}

}
