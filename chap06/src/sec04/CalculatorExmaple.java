package sec04;

public class CalculatorExmaple {

	public static void main(String[] args) {

		Calculator myCalc = new Calculator(); // 기본 생성자 호출, 컴퓨터가 자동으로 만들어줌
		myCalc.println("가나다");//리턴값 x, 내부 호출 x
		
		int result1 = myCalc.plus(6, 4);//return값이 있기 때문에 return값을 result로 받아줘야 출력이 가능함.. 즉 메소드를 호출하려면 새로운 변수로 설정해줘야한다.
		System.out.println(result1);//리턴값 o, 내부 호출 x
		
		double result2 = myCalc.avg(10,15); // 내부 호출 한 구문(합계)
		System.out.println(result2);//리턴값 o, 내부 호출 o
		
		myCalc.excute(); // 리턴값 x, 내부 호출 3번 : 첫번째 avg, 두번째 plus 세번째 println
	}

}
