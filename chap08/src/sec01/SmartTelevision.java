package sec01;

// 인터페이스를 중첩으로 구현 
public class SmartTelevision implements RemoteControl, Searchable {

	private int volume;

	// Searchable의 추상 메소드 오버라이드
	public void search(String url) {

	}
	
	//	RemoteControl의 추상 메소드 3개의 실체 메소드
	public void turnOn() {
		System.out.println("스마트티비를 켭니다.");
	}

	public void turnOff() {
		System.out.println("스마트티비를 끕니다.");
	}

	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);

	}

}
