package sec06.exam02.mycompany; // 현재 폴더의 패키지

import sec06.exam02.hankook.*; // import 패키지
import sec06.exam02.kumho.*; // 클래스 마지막(kumho)에 .*를 붙이면 클래스 전체 import

public class Car {

	SnowTire tire1 = new SnowTire(); // import 했을 때 객체 생성 가능
	// Tire tire2 = new Tire(); 똑같은 이름의 클래스(tire)를 2개 import 시키면 경로명까지 적어줘야한다(구분짓기
	// 위해서)
	sec06.exam02.hankook.Tire tire3 = new sec06.exam02.hankook.Tire();
	sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire();

}
