package sec02;

public class Ȯ�ι���3 {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 6) + 1;
		int b = (int) (Math.random() * 6) + 1;
		
		System.out.print(a + " ");
		System.out.println(b);
		
		while ((a + b) != 5) {
			a = (int) (Math.random() * 6) + 1;
			b = (int) (Math.random() * 6) + 1;
			
			System.out.print(a + " ");
			System.out.println(b);
			
			if (a + b == 5) {
				break;
			}
		}

	}

}
