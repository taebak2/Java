package sec06.exam04.package1;

public class A {
	A a1 = new A(true); // �Ű����� boolean�� �ִ� ������ ȣ��
	A a2 = new A(1); // �Ű����� int�� �ִ� ������ ȣ��
	A a3 = new A("���ڿ�"); // �Ű����� String�� �ִ� ������ ȣ��

	public A(boolean b) {
	} // a1 public

	A(int b) {
	} // a2 default

	private A(String s) {
	} // a3 private

}
