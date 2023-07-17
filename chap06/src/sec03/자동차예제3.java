package sec03;

public class 자동차예제3 {

	public static void main(String[] args) {

		Car2 car2 = new Car2("자가용"); // Car2.java의 생성자(Car2(String model))의 값을채택 == 자가용은 String값이니까
		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println(car2.maxSpeed);

	}

}
