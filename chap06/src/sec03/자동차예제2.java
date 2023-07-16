package sec03;

public class 자동차예제2 {

	public static void main(String[] args) {

		Car car3 = new Car("Tesla3", "red", 350);
		System.out.println("모델명 : " + car3.model);
		System.out.println("색상 : " + car3.color);
		System.out.println("최고 속도 : " + car3.maxSpeed);

	}

}
