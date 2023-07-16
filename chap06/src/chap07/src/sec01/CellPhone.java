package sec01;

public class CellPhone {
	String model;
//private String model; DmbCellPhone에서 상속받기 위해선 getter, setter를 이용해야한다.
	String color;
	
	// default 같은 패키지의 경우 사용 가능 자식의 경우에도 사용 가능
	
	// 생성자
	
	// 메소드
	
	void powerOn() {System.out.println("전원을 켭니다.");}
	void powerOff() {System.out.println("전원을 끕니다.");}
	void bell() {System.out.println("벨이 울립니다.");}
	void sendVoice(String message) {System.out.println("자기 : " + message);}
	void receiveVoice(String message) {System.out.println("상대방 : " + message);}
	void hangUp() {System.out.println("전화를 끊습니다");}

}
