package sec01;

public class Button {
	OnClickListener listener;

	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}

	void touch() {
		listener.onClick();
	}

	static interface OnClickListener {
		void onClick(); // interface�� ��� �ʵ�, �߻� �޼ҵ常 ��� �����ϱ� ������ public abstract�� ����

	}

}
