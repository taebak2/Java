package common;

public class Car {
	private String CarName;
	private String CarColor;
	private int CarPrice;

	public String getCarName() {
		return CarName;
	}

	public void setCarName(String carName) {
		CarName = carName;
	}

	public String getCarColor() {
		return CarColor;
	}

	public void setCarColor(String carColor) {
		CarColor = carColor;
	}

	public int getCarPrice() {
		return CarPrice;
	}

	public void setCarPrice(int carPrice) {
		CarPrice = carPrice;
	}

	public Car() {
	}

	public Car(String carName, String carColor, int carPrice) {
		CarName = carName;
		CarColor = carColor;
		CarPrice = carPrice;
	}

}
