package sec01;

public class CheckBoxExample {

	public static void main(String[] args) {
		CheckBox checkBox = new CheckBox(); // CheckBox 클래스 객체 생성
		checkBox.setOnSelectListener(new BackgroundChangeListener()); // CheckBox 안 setOnSelectListener ??
		checkBox.select();

	}

}
