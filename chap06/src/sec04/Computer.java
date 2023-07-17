package sec04;

public class Computer {
	//매개 변수의 개수를 모를 때 배열을 사용한다.
	// 배열 전체 숫자의 합계 (배열 개수 정해지지 않았다~) -> 호출할 때 배열 개수를 알려줘야한다.
	int sum1(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];

		}
		return sum;
	}

	public static void main(String[] args) {
		Computer myCom = new Computer();
		int[] values1 = { 1, 2, 3 }; // 매개 변수 배열 타입으로 선언하는 방법1
		int result = myCom.sum1(values1);
		System.out.println(result);

		int result2 = myCom.sum1(new int[] { 1, 2, 3 }); // 매개 변수 배열 타입으로 선언하는 방법2
		System.out.println(result2);
	}
}
