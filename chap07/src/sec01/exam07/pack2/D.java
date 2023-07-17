package sec01.exam07.pack2;

import sec01.exam07.pack1.A;

public class D extends A {

	String a;
	String b;

	public D(String a, String b) { // 다른 패키지라도 상속받은 자식 클래스는 접근 됨

		super(); // protected A 생성자에 접근...
		this.field = "value";
		this.method();
		this.a = a;
		this.b = b;

	}

}
