package sec01.exam06;

public class SportsCar extends Car{
	@Override
	public void speedUp() {
		speed+=10;
	}
	// @Override // �� ����� �������̵� �� �ٿ�����Ѵ�. override{�߰�ȣ �� ����} vs overload{������ ���� �� �Ű����� �� �ٸ���}  
	// public void stop() {} // Car class�� stop�� final �޼ҵ��̱� ������ �ҷ��� �� ����.
	public void stop(int x) {  
	System.out.println("������ī�� ����");
	speed=0;
	}

}
