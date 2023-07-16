package sec02;

public class 배열3 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] { 83, 90, 87 }; // 왜 써야하는지??
		
		// main(String[] args) 바깥에서 return값을 출력할 add를 입력 ex) (int) sum 2= add -> public static (int) 종류 같아야함		 
		
		// int[] scores = {83,90,87}; 압축해서 사용 가능함

		int sum1 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 += scores[i];

		}
		System.out.println("총합 : " + sum1);

		int sum2 = add(new int[] { 83, 90, 87 });
		System.out.println("총합 : " + sum2);
		System.out.println();
	}

	public static int add(int[] scores) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		return sum;
	} 

}
