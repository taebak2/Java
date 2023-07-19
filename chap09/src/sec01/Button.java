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
		void onClick(); // interface는 상수 필드, 추상 메소드만 사용 가능하기 때문에 public abstract가 생략

	}

}
