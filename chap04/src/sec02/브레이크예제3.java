package sec02;

public class �극��ũ����3 {
	public static void main(String[] args) {
		/*outer�� ���� Ư�� ������ �����ϸ� �ݺ����� Ż���Ѵ�.*/

		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {
					break Outter;
				}
			}
		}
		System.out.println("���α׷� ���� ����");
	}
}
