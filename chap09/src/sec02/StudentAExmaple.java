package sec02;

public class StudentAExmaple {

	public static void main(String[] args) {

		// StudentB 객체 생성하세요
		StudentA a = new StudentA(); // static이 없기 때문에 초기 선언 필요
		StudentA.StudentB b = a.new StudentB();
		// 방법 2 : StudentA.StudentB b= new StudentA().new StudentB(); // A.B b = new
		// A.new B

		b.name = "김철수";
		b.age = 22;
		b.sleep();

		a.person.wake();
		// a.person.work(); // person 객체에 work 메소드가 없음 즉 work는 오버라이드된 메소드가 아님
		a.method1();

		// method2는 매개변수로 Person 클래스 타입을 넘겨줘야 함
		// 매개변수는 마지막에 ; 사용안함
		a.method2(new Person() {
			void study() {
				System.out.println("공부합니다.");
			}

			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
				// 오버라이드 안된 메소드(study)는 호출이 안되기 때문에
				// 이중으로 메소드를 호출함
			}
		}

		);
	}
}
