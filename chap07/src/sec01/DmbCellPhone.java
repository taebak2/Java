package sec01;

public class DmbCellPhone extends CellPhone/* CellPhone 상속 */ {

	// 필드

	int channel;

	// 생성자;

	DmbCellPhone(String model, String color, int channel) {
		this.color = color; // 상속받은 필드
		this.model = model; // 상속받은 필드
		this.channel = channel; 
	}
	// 메소드

	void turnOnDmb() {
		System.out.println("채널 " + "channel" + "번 DMB 방송 수신을 시작합니다.");
	}

	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널" + channel + "번으로 바꿉니다.");
	}

	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}

}
