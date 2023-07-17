package sec02.exam06;

public class InstanceofExample {

	public static void main(String[] args) {
		Parent parentA = new Child(); // child를 parent에 상속
		method1(parentA);

		Parent parentB = new Parent();
		method1(parentB);
	}

	public static void method1(Parent parent) {

		if (parent instanceof Child) { // 강제 타입 변환 전 instanceof 연산자로 검사하는 것이 좋음
			Child child = (Child) parent; // child를 parent에 상속시켰기 때문에 강제형변환 가능
			System.out.println("강제 변환 성공");
		} else {
			System.out.println("강제 변환 실패");

		}
	}

}
