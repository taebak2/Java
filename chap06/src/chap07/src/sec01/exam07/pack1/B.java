package sec01.exam07.pack1;

public class B {
	//A와 B는 같은 패키지
	public void method() {
		// protected는 같은 패키지 + 파생 클래스(부모-자식)에서 자유롭게 접근 가능함!!, private은 같은 class내에서만 가능,  default는 같은 패키지안에서만..
		A a = new A();
		a.field = "value";
		a.method();
	}

}
