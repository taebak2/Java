package sec04;

public class Travel {
	private int oil;
	private String location;

	// set�� �� �����Ҷ� �ʿ� get�� read ... set,get �Ѵ� �Է½� ù���� �빮�� 
	// set�� void �� return�� �ʿ� ����.. ��� ()�ȿ� ������ �Է�������� get�� return�� �ʿ�
	
	
	public int getOil() {
		return oil; 
	}

	public void setOil(int oil) {
		this.oil = oil;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	void oilMinus(int x) {
		oil -= x;
	}

	boolean oilLeft() {
		if (oil <= 0) {
			System.out.println("�ֹ����� �����. ���� �����ϼ���");
			return false;
		} else {
			System.out.println("�ֹ����� ���Ҿ��. ��� �����ϼ���");
			return true;
		}
	}
}
