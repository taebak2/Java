package sec01;

public class Computer2 extends Calculator{

	@Override // static은 override 불가능 
	double areaCircle(double r) {
		System.out.println("Computer2의 areaCircle() 실행");
		return Math.PI * r * r;
		
		
	}
	

}
