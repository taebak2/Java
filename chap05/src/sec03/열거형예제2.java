package sec03;

import java.util.Calendar;



public class ����������2 {

	public static void main(String[] args) {
		Part quarter = null; // ���Ϳ� ���� ����
		Calendar cal = Calendar.getInstance(); // ���� �ð� ��¥ ���..
		int q = cal.get(Calendar.MONTH) + 1;
		switch (q) {
		case 1:
		case 2:
		case 3:
			quarter = Part.�ϻ�б�;
			break;

		case 4:
		case 5:
		case 6:
			quarter = Part.�̻�б�;
			break;

		case 7:
		case 8:
		case 9:
			quarter = Part.���б�;
			break;

		case 10:
		case 11:
		case 12:
			quarter = Part.���б�;
			break;
			
		}
		System.out.println(quarter);
		
		if(q<=3) {
			quarter = Part.�ϻ�б�;
		}
		
		
	}

}
