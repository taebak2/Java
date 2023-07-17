package sec05;

public class SingleTon {
	private static SingleTon singleton = new SingleTon();

	// �̱����� ��ü �ѹ��� ����
	private SingleTon() {
	} // ������

	static SingleTon getInstance() {
		return singleton;
	}

	public static void main(String[] args) {
		// SingleTon obj1 = new SingleTon();
		// SingleTon obj2 = new SingleTon();

		SingleTon obj1 = SingleTon.getInstance(); // singleton�� �޼ҵ� .getinstance�� ���ؼ� ������ new �� ���������ʴ´�~
		SingleTon obj2 = SingleTon.getInstance();

		if (obj1 == obj2) {
			System.out.println("���� ��ü");
		} else {
			System.out.println("�ٸ� ��ü");

		}
	}

}
