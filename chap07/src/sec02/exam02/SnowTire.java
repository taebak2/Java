package sec02.exam02;

public class SnowTire extends Tire {
String chain; // 체인 착용여부
int price; // 가격 

	
void chainWear(){
	System.out.println("체인을 착용합니다.");
}	
void chainTakeOff() {
	System.out.println("체인을 벗겨냅니다.");
}
void run() {
	System.out.println("스노우 타이어가 굴러갑니다.");
}
void stop() {
	System.out.println("스노우 타이어가 멈춥니다.");
}
}
