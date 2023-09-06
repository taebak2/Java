package dto;

import java.util.ArrayList;

public class ClothRepository {

	ArrayList<Cloth> clothList = new ArrayList<Cloth>();

	public ClothRepository() {

		Cloth cloth1 = new Cloth();
		cloth1.setClothId("a1");
		cloth1.setClothName("컴포트셔츠");
		cloth1.setClothCost(189000);
		cloth1.setClothSize(3);
		cloth1.setClothColor("Sax");

		clothList.add(cloth1);
		Cloth cloth2 = new Cloth();
		cloth2.setClothId("a2");
		cloth2.setClothName("블루종");
		cloth2.setClothCost(289000);
		cloth2.setClothSize(3);
		cloth2.setClothColor("Light Gray");

		clothList.add(cloth2);
		Cloth cloth3 = new Cloth();
		cloth3.setClothId("a3");
		cloth3.setClothName("슈즈");
		cloth3.setClothCost(280000);
		cloth3.setClothSize(285);
		cloth3.setClothColor("black");

		clothList.add(cloth3);
	}

	public ArrayList<Cloth> getAllClothes() {
		return clothList;
	}

	public Cloth getClothById(String clothId) {
		Cloth ClothById = null;

		for (int i = 0; i < clothList.size(); i++) {
			Cloth cloth = clothList.get(i);
			if (cloth.getClothId().equals(clothId)) {
				ClothById = cloth;
				break;
			}
		}

		return ClothById;
	}
}