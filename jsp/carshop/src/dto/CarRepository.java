package dto;

import java.util.ArrayList;

public class CarRepository {
	ArrayList<Car> car = new ArrayList<Car>();

	public CarRepository() {
		Car car1 = new Car();
		car1.setCarName("Cayenne");
		car1.setCarCost(200000000);
		car1.setCarColor("White");
		car1.setCarCompany("Porsche");
		car1.setCarSize("Suv");

		Car car2 = new Car();
		car2.setCarName("Genesis G80");
		car2.setCarCost(100000000);
		car2.setCarColor("Black");
		car2.setCarCompany("Hyundai");
		car2.setCarSize("Sedan");

		Car car3 = new Car();
		car3.setCarName("Aventador");
		car3.setCarCost(600000000);
		car3.setCarColor("Blue");
		car3.setCarCompany("Lamborghini");
		car3.setCarSize("SportsCar");

		car.add(car1);
		car.add(car2);
		car.add(car3);
	}

	public ArrayList<Car> allcar() {
		return car;
	}

	public Car getAllCar(String carId) {
		Car Allcar = null;
		for (int i = 0; i < car.size(); i++) {
			Car cars = car.get(i);

			if (cars.getCarName().equals(carId)) {
				Allcar = cars;
				break;
			}
		}
		return Allcar;
	}
}
