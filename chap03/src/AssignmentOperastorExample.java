package sec02;
import java.util.Scanner;

public class AssignmentOperastorExample {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int num1 = 100;
		System.out.println("숫자를 입력하세요");
		int a = s.nextInt();
		System.out.println("연산자를 입력하세요");
		String b = s.next();
		
		if(b.equals("+")) {num1 += a;}
		if(b.equals("-")) {num1 -= a;}
		if(b.equals("*")) {num1 *= a;}
		if(b.equals("/")) {num1 /= a;}
		
		//if (a를 숫자라고 인식한다면.. 출력)
		
		System.out.println("결과 값은"+ num1);
	}
}
