package sec01;

// 인터페이스 실행하려면 재정의 필요 
public class Television implements RemoteControl {

	private int volume;

	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	// Television 재정의(추상 메소드와 동일한 이름을 가져야한다. = RemoteControl 추상 메소드와 이름 같음..)
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
