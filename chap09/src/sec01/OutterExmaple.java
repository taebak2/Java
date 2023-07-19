package sec01;

public class OutterExmaple {

	public static void main(String[] args) {
				Outter outter = new Outter();
				Outter.Nested nested = outter.new Nested();// A.B b = a.new B(); 중첩 클래스의 인스턴스 필드 객체 생성방법
				nested.print();
				
				
				
				//Nested가 만약 정적 클래스라면 어떻게 호출??
				//Outter.Nested nested = new Outter.Nested(); A.C c = new A.C();
			}


	}

