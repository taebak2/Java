package sec01;

public class OutterExmaple {

	public static void main(String[] args) {
				Outter outter = new Outter();
				Outter.Nested nested = outter.new Nested();// A.B b = a.new B(); ��ø Ŭ������ �ν��Ͻ� �ʵ� ��ü �������
				nested.print();
				
				
				
				//Nested�� ���� ���� Ŭ������� ��� ȣ��??
				//Outter.Nested nested = new Outter.Nested(); A.C c = new A.C();
			}


	}

