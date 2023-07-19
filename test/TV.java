package test;

public class TV {
	private int size;
	
	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
public static void main(String[] args) {
	ColorTV myTv = new ColorTV(55,100);
	myTv.printProperty(); // 실행결과 55인치 100만원
	
	IPTV iptv = new IPTV("192.168.0.250",55,200);
	iptv.printProperty(); // 실행결과 IPTV 주소 : 192.168.0.250, 55인치 200만원
}

}
