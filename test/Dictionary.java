package test;

public class Dictionary extends PairMap {
	private int set;

	public Dictionary(int num) { // ���� ����Dictionary App ���� ���� ���� �߱� ������ ���� ����������
		KeyArray = new String[num]; // key�� value�� 10�� �迭 ����..
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
