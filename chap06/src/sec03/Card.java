package sec03;

public class Card {

	private String cardName;

	public Card() {
		this("����");
	}

	public Card(String cardName) {
		this.cardName = cardName;
	}

	public void getCard() {
		System.out.println("ī���� " + this.cardName + " �Դϴ�");
	}

	public static void main(String[] args) {
		Card card1 = new Card();
		Card card2 = new Card("�Ｚ");
		
		card1.getCard();
		card2.getCard();
	}
}
