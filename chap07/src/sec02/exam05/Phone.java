package sec02.exam05;

public class Phone {
	String company; // 제조회사
	int cost=100000; // 가격
	String color; // 색상
	
	
	// 리모컨, tv리모컨, 프로젝트 리모컨, 셋톱박스 리모컨, 에어컨 리모컨 + 기능(ex:온도 조절, tv채널 조정 등)
	
	
	void ring() {
		System.out.println("전화가 울립니다.");
	}
	void powerOn() {
		System.out.println("전원이 켜집니다.");
	}
	void powerOff() {
		System.out.println("전원이 꺼집니다.");
	}
}
