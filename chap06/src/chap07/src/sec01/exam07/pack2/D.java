package sec01.exam07.pack2;

import sec01.exam07.pack1.A;

public class D extends A {

	String a;
	String b;

	public D(String a, String b) { // �ٸ� ��Ű���� ��ӹ��� �ڽ� Ŭ������ ���� ��

		super(); // protected A �����ڿ� ����...
		this.field = "value";
		this.method();
		this.a = a;
		this.b = b;

	}

}
