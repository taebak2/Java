package sec01;

//CPU 종류, 그래픽카드 종류, 와이파이, 블루투스, 메소드 무선 인터넷 연결, 무선 마우스 연결, 에어팟 연결 해제
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
