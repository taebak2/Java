package sec01;

// �������̽��� ��ø���� ���� 
public class SmartTelevision implements RemoteControl, Searchable {

	private int volume;

	// Searchable�� �߻� �޼ҵ� �������̵�
	public void search(String url) {

	}
	
	//	RemoteControl�� �߻� �޼ҵ� 3���� ��ü �޼ҵ�
	public void turnOn() {
		System.out.println("����ƮƼ�� �մϴ�.");
	}

	public void turnOff() {
		System.out.println("����ƮƼ�� ���ϴ�.");
	}

	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� TV ���� : " + this.volume);

	}

}
