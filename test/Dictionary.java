package test;

public class Dictionary extends PairMap {
	private int set;

	public Dictionary(int num) { // 메인 구문Dictionary App 에서 숫자 대입 했기 때문에 숫자 만들어줘야함
		KeyArray = new String[num]; // key와 value에 10씩 배열 선언..
		valueArray = new String[num];

	}

	String get(String key) {
		return key;

	}

	void put(String key, String value) {
		for (int i = 0; i < KeyArray.length; i++) {
			
		}
		
	}

	String delete(String key) {
		return null;
	}

	int length() {
		return 0;
	}

}
