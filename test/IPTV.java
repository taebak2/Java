package test;

public class IPTV extends ColorTV {
	String ipAdress;

	public IPTV(String ipAdress, int size, int cost) {
		super(size, cost);
		this.ipAdress = ipAdress;
	}

	public void printProperty() {
		System.out.println("IPTV �ּ� : " + ipAdress + "," + getSize() + "��ġ " + cost + "����");
	}
}
