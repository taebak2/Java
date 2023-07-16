package sec01;

//제조회사 가격 생산년도 , 메소드 전원 키고 끄기, 인터넷 연결, 게임하기
public class Computer {
	String company;
	int price;
	int year;

	void powerOn() {
		System.out.println("전원을 킵니다.");
	}

	void powerOff() {

		System.out.println("전원을 끕니다.");
	}

	void internetOn() {
		System.out.println("인터넷에 연결합니다."); 
	}

	void internetOff() {
		System.out.println("인터넷을 종료합니다."); 

	}

	void gameOn() {
		System.out.println("게임을 합니다"); 
	}

	void gameOff() {
		System.out.println("게임을 종료합니다."); 

	}
}
