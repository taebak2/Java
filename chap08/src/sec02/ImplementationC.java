package sec02;

public class ImplementationC implements InterfaceC {
	public void methodA() {
		System.out.println("ImplementationC-methodA() 실행");
	}

	public void methodB() {
		System.out.println("ImplementationC-methodB() 실행");
	}

	public void methodC() {
		System.out.println("ImplementationC-methodC() 실행");
	}

	public static void main(String[] args) {
		ImplementationC imple = new ImplementationC();

		InterfaceC ic = imple;
		// 인터페이스C 객체인 ic는 A와 B의 모든 메소드 사용 가능함
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
