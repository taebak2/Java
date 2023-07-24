package sec01;

public class iPhone {
	String company = "apple";
	int cost = 1500000;
	String modelName = "iPhone14MAX";

	public iPhone(String company, int cost, String modelName) {
		this.company = company;
		this.cost = cost;
		this.modelName = modelName;
	}

	@Override
	public String toString() {
		return (company + "의 최신폰인 " + modelName + " 가격은 " + cost + "원 입니다.");
	}
}
