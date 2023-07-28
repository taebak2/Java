package sec02;

public class SynchronizedEx {
	

public static void main(String[] args) {
		ATM atm = new ATM(); // implements Runnable
		Thread mother = new Thread(atm, "엄마");
		Thread son  = new Thread(atm, "아들");
		mother.start();
		son.start();
}
}
