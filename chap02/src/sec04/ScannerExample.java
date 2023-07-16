package sec04;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputData;

		while (true) {
			inputData = scanner.nextLine(); 							 // nextLine : 문자열 라인을 통째로 인식
			System.out.println("입력된 문자열 : \"" + inputData + "\""); // "\*"역 슬래시 다음에 특수문자 입력시 특수문자만 출력
			if (inputData.equals("q")) { 								 // 숫자(int, short, char, long, float, double)는 비교 == , 문자열(ex:String)은 equals를 통해 비교
																		
				break;
			}

		}
		System.out.println("종료");
	}

}
