package sec01;

public class CheckBoxExample {

	public static void main(String[] args) {
		CheckBox checkBox = new CheckBox(); // CheckBox Ŭ���� ��ü ����
		checkBox.setOnSelectListener(new BackgroundChangeListener()); // CheckBox �� setOnSelectListener ??
		checkBox.select();

	}

}
