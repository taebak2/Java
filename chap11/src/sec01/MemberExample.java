package sec01;

public class MemberExample {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");

		
		if(obj1.equals(obj2)) {
			System.out.println("1�� 2�� ���ƿ�");
		}else {
			System.out.println("1�� 2�� �޶��");
		}
		// 1�� 2�� ���ƿ�
		
		if(obj1.equals(obj3)) {
			System.out.println("1�� 2�� ���ƿ�");
		}else {
			System.out.println("1�� 2�� �޶��");
		}
		
		// 1�� 2�� �޶��
	}

}
