package sec02;

public class StudentA {

	Person person = new Person() { /* 6번 줄부터 15번줄까지 필드값으로 익명 객체 대입 */
		void work() {
			System.out.println("등교합니다.");
		}

		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};

	//  StudentA 안에 중첩 클래스(인스턴스) StudentB 생성
	class StudentB {
		String name;
		int age;

		void sleep() {
			System.out.println("잠을 잡니다.");
		}
	}

	void method1() {

		// 메소드 익명 객체
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}

			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};

		localVar.wake();
	}

	void method2(Person person) {
		person.wake();
	}
}
