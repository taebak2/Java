package sec06.exam05.package1;

public class B {
	
	public B() {
		A a = new A() {};
		a.field1=1;// public은 모두 접근 가능
		a.field2=1;// default는 같은 패키지에서 접근 가능
		// a.field3=1; private 접근 불가
		
		a.method1(); // public은 모두 접근 가능
		a.method2(); // default는 같은 패키지에서 접근 가능
		// a.method3(); private 접근 불가 
	}
}
