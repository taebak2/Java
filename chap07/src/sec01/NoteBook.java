package sec01;

//CPU ����, �׷���ī�� ����, ��������, �������, �޼ҵ� ���� ���ͳ� ����, ���� ���콺 ����, ������ ���� ����
public class NoteBook extends Computer {
	String cpu;
	String gpu;
	String bluetooth;
	String camera;
	String airpod;

	NoteBook(String company, int price, int year) {
		this.company = company;
		this.price = price;
		this.year = year;
	}

	public NoteBook(String cpu, String gpu) {
		this.cpu = cpu;
		this.gpu = gpu;

	}

	
}
