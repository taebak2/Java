package sec02.exam02;

public class SnowTireExample extends Tire {

	public static void main(String args[]) {
		
		SnowTire STire = new SnowTire(); // SnowTire
		STire.chainWear();
		STire.run();  
		STire.stop(); 
		Tire tire = STire; // ����� Ÿ�̾� STire�� Tire�� ���� ��Ų��.
	
	
	}

}
