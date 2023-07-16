package sec03;

public class 자동차예제1 {

	public static void main(String[] args) {
		// Car car = new Car();
		Car car = new Car(); // car.java에서 public car(){}를  따로 만들어주지 않으면 에러 뜸
		Car car2 = new Car("BMW750i",250,"Volkswagen"); // 생성자 데이터 값(String model, int speed)이 3개이므로 3개를 입력해야한다.
	System.out.println("모델명 : " + car2.model);
	System.out.println("속도 : " + car2.speed);
	System.out.println("제조회사 : " + car2.company);
	}

}
