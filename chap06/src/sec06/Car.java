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
		System.out.println("색상을 입력하세요");
		String c = a.next(); // 변수명 선언해줘야함
		color = c; // 색상을 c로 바꿈
		System.out.println("변경된 색상 : " + getColor());
		
		
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed() { // setSpeed안에 변수명 입력안해도되고, 만약 입력할 시에 같은 타입으로만 출력 가능하다 
		int carSpeed = getSpeed(); // 변수 설정
	
		System.out.println("키를 눌러주세요 a는 속도 증가 s는 속도 감소");
		String key = a.next();
		System.out.println("속도를 입력해주세요");
		int changeSpeed = a.nextInt();
		int presentSpeed = getSpeed();
		
		if (key.equals("s") && presentSpeed<changeSpeed) {
			System.out.println("속도는 마이너스가 될 수 없습니다.");
		} else if (key.equals("s") && presentSpeed>=changeSpeed) {
			speed -= changeSpeed;
			System.out.println("현재속도 : " + getSpeed());
		} else {
			speed += changeSpeed;
			System.out.println("현재 속도 : " + getSpeed());
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

	public void setCompany(String company) { // 변수 company
		
		this.company = company; // this. = public class Car에 선언된 변수 String company.... 
		// Carexample에서 값을 받아오기 위해서는 car.setCompany 값을 변경시키기 위해서는 셋팅이 필요
	}

}
