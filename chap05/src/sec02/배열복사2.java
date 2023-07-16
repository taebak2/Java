package sec02;

public class 배열복사2 {

	public static void main(String[] args) {
		int[] oldIntArray = { 1, 2, 3 };
		int[] newIntArray = new int[5];
		
		System.arraycopy(oldIntArray, 0, newIntArray, 0, oldIntArray.length); // (복사할것,시작지점, 어디에 복사할지, 시작지점, 얼마만큼..)

		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}

		for (int i = 0; i < newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", "); // new intArray의 배열이 5개인데 oldInt가 3개니까 나머지 4,5번 자리는 0으로 처리...
			if (i < newIntArray.length - 1) {
				System.out.println(newIntArray[i] + ",");
			} else {
				System.out.println(newIntArray[i]);
			}
		}

	}

}
