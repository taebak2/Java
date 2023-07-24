package sec01;

public class MyPointExample {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);
		System.out.println(p); // My Point 클래스의 p 자체를 호출하면
							   //object에서 toString 호출(해시코드) 원래 최상위 클래스object에서 toString값이 있으나
							   // MyPoint 클래스에 toString을 오버라이드 했기 때문에 오버라이드값이 나옴 
		if (p.equals(q))
			System.out.println("같은 점");
		else
			System.out.println("다른 점");
	}

}
