package sec02;

public class SynchronizedEx {
	

public static void main(String[] args) {
		ATM atm = new ATM(); // implements Runnable
		Thread mother = new Thread(atm, "����");
		Thread son  = new Thread(atm, "�Ƶ�");
		mother.start();
		son.start();
}
}
