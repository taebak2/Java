package sec04;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception {
		//throws Exception ���� ��Ȳ�� ȭ�鿡 ��� (���� ���� ���� �Է�)

		int keyCode;
		
		while(true) {	// ���� �ݺ���
			keyCode = System.in.read();
			System.out.println("Ű�ڵ� : " + keyCode);
			if(keyCode == 113) {break;}
			
		}
		System.out.println("����");
	}

}
