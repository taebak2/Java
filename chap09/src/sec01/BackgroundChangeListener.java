package sec01;

public class BackgroundChangeListener implements CheckBox.OnSelectListener { // CheckBox 경로 안의 OnSelectListener를 구현하는 객체 : BackgroundChangeListetner

	@Override
	public void onSelect() {
		System.out.println("배경을 변경합니다."); // interface가 static이라 바로 접근 가능.. 
	}

}
