package sec01;

//����ȸ�� ���� ����⵵ , �޼ҵ� ���� Ű�� ����, ���ͳ� ����, �����ϱ�
public class Computer {
	String company;
	int price;
	int year;

	void powerOn() {
		System.out.println("������ ŵ�ϴ�.");
	}

	void powerOff() {

		System.out.println("������ ���ϴ�.");
	}

	void internetOn() {
		System.out.println("���ͳݿ� �����մϴ�."); 
	}

	void internetOff() {
		System.out.println("���ͳ��� �����մϴ�."); 

	}

	void gameOn() {
		System.out.println("������ �մϴ�"); 
	}

	void gameOff() {
		System.out.println("������ �����մϴ�."); 

	}
}
