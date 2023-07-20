package sec01;

public class Chatting {

	String nickName = null; //

	void StartChat(String chatId) {

		// 메소드 안의 클래스 접근 불가
		// String nickName=chatId; 앞에 final 생략된 상수값
		// 로컬 클래스가 포함된 메소드의 필드(String nickName)는 기본적으로 final이 붙어서 반드시 값을 대입해야 함..
		// 상수값이라서...
		// 로컬 클래스를 가진 메소드에서 필드 값을 null로 지정할 수는 있다.
		// 단 이 null값은 final값이 아님.. 그래서 로컬 클래스에서 사용할 때 final로 값을 지정하라고 오류가 발생

		nickName = chatId;

		class Chat { // 메소드 안의 중첩클래스 =  로컬클래스
					//로컬 클래스 안에서만 작동 만약 외부 클래스에서 가져오려면 로컬 클래스 안에서 객체 생성
					 // or 전체 클래스에서 선언
			public void start() {
				while (true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "] " + inputData;
					sendMessage(message);
				}
			}

			void sendMessage(String message) {
			}
		}

		Chat chat = new Chat();
		chat.start();
	}
}
