package sec01;

// 인터페이스 실행하려면 재정의 필요 
public class Audio implements RemoteControl {

	private int volume;

	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}

	public void turnOff() {
		System.out.println("오디오를 끕니다.");
	}

	// 오디오 재정의
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 오디오 볼륨 : " + this.volume);

	}

}
