package sec02.exam05;

public class PhoneExample {

	public static void main(String[] args) {
		
		//SmartPhone sp = new SmartPhone(); // �⺻ ��ü�� �ڱ� ���� ���� �����´�.
		
		//System.out.println(sp.cost); // :: SmartPhone cost vs Phone cost  
									   //->  ����ȯ ������ ��� SmartPhone�� cost�� ȣ�� 
		

		Phone p = new SmartPhone();
		// �ڽ� ��ü�� �θ� ��ü�� ����ȯ ��Ŵ(�ڵ� ����ȯ:���� Ŭ����(�θ�)�� �� ŭ)
		System.out.println(p.cost);
		p.powerOn(); 
		p.ring(); // �������̵�� ��ü�� SmartPhone�� �޼ҵ带 �����´�.
		
		//p.videoOn(); :: SmartPhone�� Phone���� ����ȯ �Ʊ� ������ SmartPhone�� �޼ҵ��� videoOn�� ����� �� ����.
		//p.phoneCase="�ϵ����̽�"; :: SmartPhone�� Phone���� ����ȯ �Ʊ� ������ SmartPhone�� �ʵ��� phoneCase ���� ����� �� ����.
		
		
		SmartPhone sp = (SmartPhone)p; // �θ�Ŭ������ ��ӽ��״� p�� �ٽ� �ڽ� Ŭ������ ���� ����ȯ ��Ŵ
		sp.phoneCase="����Ʈ���̽�"; // �ڽ� ��ü �ʵ峪 �޼ҵ� ����� �����ϴ�...
		sp.powerOn();
		System.out.println(sp.cost); // �θ� Ŭ������ �ڽ� Ŭ������ �ִ� ���� �̸��� �ʵ�� �ڽ� ��ü�� ���
		
		//Phone p2 = new Phone(); �ڽ� Ÿ���� �θ� Ÿ������ ��ȯ���� ���� ����(����ȯ)���� 
		//SmartPhone sp2 = (SmartPhone)p2; �θ� Ÿ���� �ڽ� Ÿ������ ���� ��ȯ ���� �ʴ´�.
	}

}
