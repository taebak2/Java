package sec01;

public class ButtonExmaple {

	public static void main(String[] args) {
		Button btn = new Button(); // ��ü ����
		
		btn.setOnClickListener(new CallListener()); // CallListener��ü�� ListenerŸ������ �ٲ�
		btn.touch();
	}

}
