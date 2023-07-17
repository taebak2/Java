package sec06.exam04.package1;

public class A {
	A a1 = new A(true); // 매개변수 boolean이 있는 생성자 호출
	A a2 = new A(1); // 매개변수 int가 있는 생성자 호출
	A a3 = new A("문자열"); // 매개변수 String이 있는 생성자 호출

	public A(boolean b) {
	} // a1 public

	A(int b) {
	} // a2 default

	private A(String s) {
	} // a3 private

}
