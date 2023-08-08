package sec01;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class test1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		List<Integer> list = new Vector<>();

		while (true) {
			System.out.println("숫자를 입력하세요");
			int num = s.nextInt();
			if(num==-1) break; //   
			list.add(num);	   // 입력할 때 마다 자동으로 추가
		}
		int max = list.get(0); // list.contains : 객체가 존재하는지 여부 확인 (true or false)
							   // list.get(i) : 객체 비교시 get으로 비교....?
		for (int i = 1; i < list.size(); i++) {
			if(max<list.get(i)) {
				max=list.get(i);
			}
		}
		System.out.println("가장 큰 수는 : " + max + " 입니다.");
	}

}
