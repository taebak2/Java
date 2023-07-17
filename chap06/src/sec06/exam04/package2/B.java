package sec06.exam04.package2;

import sec06.exam04.package1.*;

public class B {
	A a1 = new A(true); // public 패키지가 달라도 생성가능
//	A a2 = new A(1); // default 패키지가 다르면 생성 불가능
//	A a3 = new A("문자열"); // private 같은 클래스에서만 생성 가능
}
