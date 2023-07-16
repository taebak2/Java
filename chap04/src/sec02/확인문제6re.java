package sec02;

public class 확인문제6re {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) { //총 4번 라인 변경 
			for (int j = 4; j >= 1; j--) { //  j가 4,3,2,1 총 4번 실행 + 조건: 4가 1 보다 작으면(true) 공백 1번.. 근데 4> (1,2,3,) 3번실행 i가 j랑 같거나 다르니까 별 출력  
				if (i < j) {	
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
