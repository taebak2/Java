package test;

public class Dictionary extends PairMap {
	private int set; // 데이터를 추가한 후 배열 번호를 증가시키기 위한 값

	public Dictionary(int num) { // 메인 구문 DictionaryApp 에서 숫자 대입 했기 때문에 숫자 만들어줘야함
		KeyArray = new String[num]; // key와 value에 10씩 배열 선언..
		valueArray = new String[num];
		this.set = 0; // 배열 번호의 초기값

	}

	// 키(이름)으로 값(과목)을 검색하는 메소드
	public String get(String key) {
		for (int i = 0; i < KeyArray.length; i++) {
			if (key.equals(KeyArray[i])) {
				return valueArray[i];
			}
		}
		return null; // 원하는 key가 없다면 null 리턴
	}

	// 입력받은 키(이름)와 값(과목)을 이용하여 배열에 추가
	// 단, 키(이름)가 중복되면 기존꺼 변경
	public void put(String key, String value) {
		for (int i = 0; i < KeyArray.length; i++) {
			if (key.equals(KeyArray[i])) {
				valueArray[i] = value;
				return; // 중복된 key가 있다면 저장하고 public void put(함수) 종료
			}
		}
		KeyArray[set] = key; // 새로운 배열 방에 입력된 값 추가
		valueArray[set] = value;
		set++; // 배열 방 번호 증가
	}

	public String delete(String key) {
		for (int i = 0; i < KeyArray.length; i++) {
			if (key.equals(KeyArray[i])) {
				String s = valueArray[i]; // 삭제된 value 값을 보여주기 위해서 String 선언 
				KeyArray[i] = null;
				valueArray[i] = null;
				return s; // 삭제된 value 값 리턴
			}
		}
		return null; // 삭제된 것이 없다면 null 리턴
	}

	public int length() {
		return set; // 배열의 최종 개수
	}

}
