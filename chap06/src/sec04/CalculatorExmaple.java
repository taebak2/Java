package sec04;

public class CalculatorExmaple {

	public static void main(String[] args) {

		Calculator myCalc = new Calculator(); // �⺻ ������ ȣ��, ��ǻ�Ͱ� �ڵ����� �������
		myCalc.println("������");//���ϰ� x, ���� ȣ�� x
		
		int result1 = myCalc.plus(6, 4);//return���� �ֱ� ������ return���� result�� �޾���� ����� ������.. �� �޼ҵ带 ȣ���Ϸ��� ���ο� ������ ����������Ѵ�.
		System.out.println(result1);//���ϰ� o, ���� ȣ�� x
		
		double result2 = myCalc.avg(10,15); // ���� ȣ�� �� ����(�հ�)
		System.out.println(result2);//���ϰ� o, ���� ȣ�� o
		
		myCalc.excute(); // ���ϰ� x, ���� ȣ�� 3�� : ù��° avg, �ι�° plus ����° println
	}

}
