package sec02;

public class �ڵ�������1 {

	public static void main(String[] args) {
		Car myCar = new Car(); // Car ��ü ���� instance�̸��� myCar

		System.out.println("ȸ�� �̸� :" + myCar.company);
		System.out.println("�𵨸� :" + myCar.model);

		myCar.company = "���������";
		myCar.model = "�ƺ�Ÿ����";
		
		System.out.println("ȸ�� �̸� : " + myCar.company);
		System.out.println("�𵨸� : " + myCar.model);
	}

}
