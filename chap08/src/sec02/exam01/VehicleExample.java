package sec02.exam01;

public class VehicleExample {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();
		vehicle.run(); // �������̵�� run ȣ�� ���� 
		//vehicle.stop(); // ���� ��ü �޼ҵ� �ٷ� ȣ�� �Ұ���
		
		Bus bus = (Bus) vehicle; // ���� ��ü Ÿ������ ���� ��ȯ 
		bus.stop(); // ���� ��ü �޼ҵ� ȣ�� ����
		
		// Vehicle vehicle2 = new Vehicle(); // �������̽��� ��ü ���� �Ұ���(�����ڰ� ���� ������)
		// Bus bus2 = (Bus)vehicle2;
		//bus2.run();
		//bus2.stop();
		

	}

}
