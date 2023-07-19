package test;

public class Dictionary extends PairMap {

	public Dictionary(int num) {

		KeyArray = new String[num];
		valueArray = new String[num];

	}

	public String get(String key) {
		for (int i = 0; i < KeyArray.length; i++) {
			if (key.equals(KeyArray[i])) {
				return valueArray[i]; // key와 같은 값을 가진 value 리턴 
			}
		}
		return null;
	}

	public void put(String key, String value) {
		for (int i = 0; i < KeyArray.length; i++) {
			if (KeyArray[i] == null || KeyArray[i].isEmpty()) { // KeyArray[i]가 빈 공간인지 확인하는 작업 isEmpty() = 문자열의 길이 확인
				KeyArray[i] = key;
				valueArray[i] = value;
				break;
			} else if (key.equals(KeyArray[i])) {
				valueArray[i] = value;
				break;
			}
		}

	}

	public String delete(String key) {
		for (int i = 0; i < KeyArray.length; i++) {
			String s = valueArray[i];
			if (key.equals(KeyArray[i])) {
				KeyArray[i] = null;
				valueArray[i] = null;
				return s;
			}
		}
		return null;
	}

	int length() {
		int sum = 0;
		for (int i = 0; i < KeyArray.length; i++) {
			if (KeyArray[i] != null && !KeyArray[i].isEmpty()) { 
				sum++;
			}
		}
		return sum;
	}

}
