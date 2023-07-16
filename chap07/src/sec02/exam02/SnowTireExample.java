package sec02.exam02;

public class SnowTireExample extends Tire {

	public static void main(String args[]) {
		
		SnowTire STire = new SnowTire(); // SnowTire
		STire.chainWear();
		STire.run();  
		STire.stop(); 
		Tire tire = STire; // 스노우 타이어 STire를 Tire에 종속 시킨다.
	
	
	}

}
