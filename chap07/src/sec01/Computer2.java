package sec01;

public class Computer2 extends Calculator{

	@Override // static�� override �Ұ��� 
	double areaCircle(double r) {
		System.out.println("Computer2�� areaCircle() ����");
		return Math.PI * r * r;
		
		
	}
	

}
