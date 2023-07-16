package sec04;

public class Travel {
	private int oil;
	private String location;

	// set은 값 변경할때 필요 get은 read ... set,get 둘다 입력시 첫글자 대문자 
	// set은 void 로 return값 필요 없음.. 대신 ()안에 변수값 입력해줘야함 get은 return값 필요
	
	
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
			System.out.println("휘발유가 없어요. 여행 종료하세요");
			return false;
		} else {
			System.out.println("휘발유가 남았어요. 계속 여행하세요");
			return true;
		}
	}
}
