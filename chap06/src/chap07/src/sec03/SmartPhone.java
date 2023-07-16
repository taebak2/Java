package sec03;

public class SmartPhone extends Phone {
	int cost; // 가격

	public SmartPhone(String owner, int cost) {
		super(owner);// field 왜 안만들어짐?
		this.cost = cost;
	}

	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}

}
