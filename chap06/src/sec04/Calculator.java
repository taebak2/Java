package sec04;

public class Calculator {

	int plus(int x, int y) { // �հ� ���ϴ� �޼ҵ�
		int result = x + y;
		return result;
	}

	double avg(int x, int y) { // ��� ���ϴ� �޼ҵ�
		double sum = plus(x, y); // ��ü ���ο��� �հ� �޼ҵ� ȣ��
		double result = sum / 2;
		return result;

	}

	void excute() {
		double result = avg(7, 10);
		println("������ : " + result); // ������ �� �����̰� ó���� ���ڿ��� �ͼ� result���� int���� String���� ��ȯ �� println�� ��ü�� String���� �ٲ� 
										 // println!=System.out.println -> �޼ҵ� println
	}

	void println(String message) { //excute�� println���� String�̶� String���� �޾���
		System.out.println(message);
		
	}
	

}
