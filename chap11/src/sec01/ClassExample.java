package sec01;

public class ClassExample {

	public static void main(String[] args) throws Exception{
		//ù ��° ���
		//Class clazz = Key.class;
		//Class clazz1 = Class.forName("sec01.Key");
		
		Key key = new Key(50);
		Class clazz = key.getClass();
		System.out.println(clazz.getName()); // getName : ��Ű�� + Ŭ����
											 // ���� ��� Ȯ���� �� �ַ� ��� 
		
		
		Class clazz2 = Member.class;
		System.out.println(clazz2.getSimpleName()); // getSimpleName : Ŭ���� �̸��� ����
		
	}

}
