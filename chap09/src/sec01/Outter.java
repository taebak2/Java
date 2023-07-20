package sec01;

public class Outter {
	String name = "홍길동";

	void reName() {
		System.out.println("홍길동 이름 변경합니다.");
	}

	class Nested { // 인스턴스 필드 
		String name = "장동건";

		void reName() {
			System.out.println("장동건 이름 변경합니다.");
		}

		void print() {
			System.out.println(this.name); // Nested 필드에 접근 
			System.out.println(Outter.this.name); // Outter의 필드에 접근
		}
	}

}
