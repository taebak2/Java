package sec02;

public class ImplementationC implements InterfaceC {
	public void methodA() {
		System.out.println("ImplementationC-methodA() ����");
	}

	public void methodB() {
		System.out.println("ImplementationC-methodB() ����");
	}

	public void methodC() {
		System.out.println("ImplementationC-methodC() ����");
	}

	public static void main(String[] args) {
		ImplementationC imple = new ImplementationC();

		InterfaceC ic = imple;
		// �������̽�C ��ü�� ic�� A�� B�� ��� �޼ҵ� ��� ������
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
