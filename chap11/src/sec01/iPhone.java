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
		return (company + "�� �ֽ����� " + modelName + " ������ " + cost + "�� �Դϴ�.");
	}
}
