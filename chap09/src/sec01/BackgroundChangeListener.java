package sec01;

public class BackgroundChangeListener implements CheckBox.OnSelectListener { // CheckBox ��� ���� OnSelectListener�� �����ϴ� ��ü : BackgroundChangeListetner

	@Override
	public void onSelect() {
		System.out.println("����� �����մϴ�."); // interface�� static�̶� �ٷ� ���� ����.. 
	}

}
