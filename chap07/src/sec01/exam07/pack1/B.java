package sec01.exam07.pack1;

public class B {
	//A�� B�� ���� ��Ű��
	public void method() {
		// protected�� ���� ��Ű�� + �Ļ� Ŭ����(�θ�-�ڽ�)���� �����Ӱ� ���� ������!!, private�� ���� class�������� ����,  default�� ���� ��Ű���ȿ�����..
		A a = new A();
		a.field = "value";
		a.method();
	}

}
