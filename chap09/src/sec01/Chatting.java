package sec01;

public class Chatting {

	String nickName = null; //

	void StartChat(String chatId) {

		// �޼ҵ� ���� Ŭ���� ���� �Ұ�
		// String nickName=chatId; �տ� final ������ �����
		// ���� Ŭ������ ���Ե� �޼ҵ��� �ʵ�(String nickName)�� �⺻������ final�� �پ �ݵ�� ���� �����ؾ� ��..
		// ������̶�...
		// ���� Ŭ������ ���� �޼ҵ忡�� �ʵ� ���� null�� ������ ���� �ִ�.
		// �� �� null���� final���� �ƴ�.. �׷��� ���� Ŭ�������� ����� �� final�� ���� �����϶�� ������ �߻�

		nickName = chatId;

		class Chat { // �޼ҵ� ���� ��øŬ���� =  ����Ŭ����
					//���� Ŭ���� �ȿ����� �۵� ���� �ܺ� Ŭ�������� ���������� ���� Ŭ���� �ȿ��� ��ü ����
					 // or ��ü Ŭ�������� ����
			public void start() {
				while (true) {
					String inputData = "�ȳ��ϼ���";
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
