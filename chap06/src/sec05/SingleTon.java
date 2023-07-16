package sec05;

public class SingleTon {
	private static SingleTon singleton = new SingleTon();

	// 싱글톤은 객체 한번만 만듬
	private SingleTon() {
	} // 생성자

	static SingleTon getInstance() {
		return singleton;
	}

	public static void main(String[] args) {
		// SingleTon obj1 = new SingleTon();
		// SingleTon obj2 = new SingleTon();

		SingleTon obj1 = SingleTon.getInstance(); // singleton은 메소드 .getinstance를 통해서 가져옴 new 로 가져오지않는다~
		SingleTon obj2 = SingleTon.getInstance();

		if (obj1 == obj2) {
			System.out.println("같은 객체");
		} else {
			System.out.println("다른 객체");

		}
	}

}
