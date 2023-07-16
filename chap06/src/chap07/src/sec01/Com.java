package sec01;

public class Com {

	public static void main(String[] args) {
		NoteBook com = new NoteBook("apple", 2500000, 20230711);
		System.out.println("제조회사 : " + com.company);
		System.out.println("가격 : " + com.price + "원");
		System.out.println("학번 : " + com.year);

		NoteBook note = new NoteBook("i7 13300k","RTX4080ti");
		System.out.println("cpu : " + note.cpu);
		System.out.println("gpu : " + note.gpu);
		com.powerOn();
		com.internetOn();
		com.gameOn();
		com.gameOff();
		com.internetOff();
		com.powerOff();
		
		
	}
	
}
