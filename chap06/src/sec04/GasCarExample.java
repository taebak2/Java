package sec04;

public class GasCarExample {

	public static void main(String[] args) {
		GasCar myCar = new GasCar();
		myCar.setGas(5);

		boolean gasState = myCar.isLeftGas(); // isLeftGas = gasCar�� ���ϰ� true or false �� �ٲ�
		// myCar.isLeftGas == true,false ���� ��
		if (gasState) { // if gasState = true or false ���~
			System.out.println("����մϴ�.");
			myCar.run();
		}

		if (myCar.isLeftGas()) { // if�ȿ� ������ true�� �ʿ� �����ϴ� ���
			System.out.println("������ ������ �ʿ䰡 �����ϴ�.");
		} else { // if�ȿ� ������ false�� ������ �����ϼ��䰡 ���
			System.out.println("������ �����ϼ���.");
		}
	}

}
