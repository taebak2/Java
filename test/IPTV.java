package test;

public class IPTV extends ColorTV {
	String ipAdress;

	public IPTV(String ipAdress, int size, int cost) {
		super(size, cost);
		this.ipAdress = ipAdress;
	}

	public void printProperty() {
		System.out.println("IPTV 주소 : " + ipAdress + "," + getSize() + "인치 " + cost + "만원");
	}
}
