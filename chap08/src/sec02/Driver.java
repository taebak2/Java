package sec02;

import sec02.exam01.Bus;
import sec02.exam01.Vehicle;

public class Driver {

	public void drive(Vehicle vehicle) {
		vehicle.run();
		//vehicle.stop();
	}
	// �Ű������� �������̽� ��ü�� �޼ҵ�

	public static void main(String[] args) {
		Driver driver = new Driver();
		// Driver ��ü ����
		Bus bus = new Bus(); // Bus ��ü ����
		Taxi taxi = new Taxi(); // Taxi ��ü ����
		
		driver.drive(bus); // bus ��ü�� �Ű������� �Ѱ��ָ�
						   // bus�� Vehicle �������̽��� ���� ��ü�̹Ƿ�
						   // Vehicle Ÿ������ �ڵ� ����ȯ��
		
						   // driver.stop(); �����߻�
						   // bus�� Vehicle Ÿ������ �ڵ� ��ȯ�Ǿ�
		 				   // �������̵�� run�� ��밡��������, stop�� �Ұ��� 
	}

}
