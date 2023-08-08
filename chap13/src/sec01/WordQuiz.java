package sec01;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public class WordQuiz {

	Scanner sc = new Scanner(System.in);
	private String name; // ���� ���α׷��� �̸�
	private Vector<Word> v;

	public WordQuiz(String name) {
		this.name = name;
		v = new Vector<Word>(); // word Ŭ���� ����
		v.add(new Word("love", "���"));
		v.add(new Word("animal", "����"));
		v.add(new Word("emotion", "����"));
		v.add(new Word("human", "�ΰ�"));
		v.add(new Word("stock", "�ֽ�"));
		v.add(new Word("trade", "�ŷ�"));
		v.add(new Word("society", "��ȸ"));
		v.add(new Word("baby", "�Ʊ�"));
		v.add(new Word("honey", "��"));
		v.add(new Word("dall", "����"));
		v.add(new Word("bear", "��"));
		v.add(new Word("picture", "����"));
		v.add(new Word("painting", "�׸�"));
		v.add(new Word("fault", "����"));
		v.add(new Word("example", "����"));
		v.add(new Word("eye", "��"));
		v.add(new Word("statue", "������"));
	}

	// ex[] �迭�� 4���� ���⸦ �����. ����� ���� �ܾ� ���Ϳ� �ִ� �ܾ �����ϰ� 4���� �����ϰ� 
	// ���Ϳ� ���� �ε����� ex[] �迭�� �����Ѵ�.
	// answerIndex�� ������ �ִ� ������ �ε����̹Ƿ�, ex[]���� answerIndex ���� ���� �ʵ��� �Ѵ�.
	// �׷��Ƿ� �� �޼ҵ尡 ������ ���� answerIndex�� ���� ex[] �迭�� ���������, ex[] �迭�� ���� ������ �ε���Ʋ
	// �����Ѵ�. �� �޼ҵ尡 ���� �� �� ��ġ�� answerIndex�� �ɴ´�.
	
	private int makeExample(int ex[], int answerIndex) {
		int n[] = new int[4]; // ������ 4�� 
		int index;
		for (int i = 0; i < n.length; i++) {
			do {
				index = (int) (Math.random() * v.size()); // �� �ܾ� ���� 
			} while (index == answerIndex || exists(n, index)); // �ٽ� �õ�
			n[i] = index;
		}

		for (int i = 0; i < n.length; i++)
			ex[i] = n[i];
		return (int) (Math.random() * n.length); // ex[] �迭 ���� ������ ��ġ ����. �̰��� ������ �ɴ´�.
	}

	// �迭 n[]�� index�� ���� �����ϸ� true, �ƴϸ� false ����
	private boolean exists(int n[], int index) {
		for (int i = 0; i < n.length; i++) {
			if (n[i] == index)
				return true;
		}
		return false;
	}

	public void quiz() {
		System.out.println("\"" + name + "\"" + "�� �ܾ� �׽�Ʈ�� �����մϴ�. -1�� �Է��ϸ� �����մϴ�.");
		System.out.println("���� " + v.size() + "���� �ܾ ��� �ֽ��ϴ�.");
		while (true) {
			int answerIndex = (int)(Math.random() * v.size()); // ������ ��� �ִ� ���� �׸��� �ε���
			String eng = v.get(answerIndex).getEnglish(); // ������ �־��� ���� �ܾ�

			// 4���� ���⸦ ���� ������ index �迭
			int example[] = new int[4];

			int answerLoc = makeExample(example, answerIndex); // ������ �ִ� ���� ��ȣ
			example[answerLoc] = answerIndex; // ���⿡ ���� �ε��� ����

			// ������ ����մϴ�.
			System.out.println(eng + "?");
			for (int i = 0; i < example.length; i++)
				System.out.print("(" + (i + 1) + ")" + v.get(example[i]).getKorean() + " "); // ���� ���

			System.out.print(":>"); // ������Ʈ
			try {
				int in = sc.nextInt(); // ������� ���� �Է�
				if (in == -1) {
					break; // ���α׷� ����
				}

				// ����ڰ� 1~4 ������ ���� �Է�
				in--; // 1~4�� 0~3�� �ε����� �ٲ�
				if (in == answerLoc)
					System.out.println("Excellent !!");
				else
					System.out.println("No. !!");
			} catch (InputMismatchException e) {
				sc.next(); // ���� ��Ʈ�� ���ۿ� �ԷµǾ� �ִ� �Է��� �о ������
				System.out.println("���ڸ� �Է��ϼ��� !!");
				// while ������ �ٽ� �ݺ�
			}
		}
	}

	private boolean contains(String eng) {
		for (int i = 0; i < v.size(); i++) {
			if (v.get(i).getEnglish().equals(eng)) { // ����ڰ� �Է��� �ܾ �̹� �ִٸ�
				return true;
			}
		}
		return false;
	}

	public void insert() {
		System.out.print("���� " + v.size() + "�� �ܾ �ԷµǾ� �ֽ��ϴ�.");
		System.out.println("-1�� �Է��ϸ� �׽�Ʈ�� �����մϴ�.");
		while (true) {
			System.out.print("���� �ѱ� �Է�>>");
			String english = sc.next();
			if (english.equals("�׸�"))
				break;
			String capital = sc.next();

			if (contains(english)) { // ����ڰ� �Է��� �ܾ �̹� �ִٸ�
				System.out.println(english + "�� �̹� �ֽ��ϴ�!");
				continue;
			}

			v.add(new Word(english, capital)); // ���Ϳ� ��ü �߰�
		}
	}

	public void run() {
		System.out.println("****���� �ܾ� �׽�Ʈ ���α׷� \"��ǰ����\" �Դϴ�. ****");
		while (true) {
			System.out.print("�ܾ��׽�Ʈ:1, �ܾ� ����:2, ����:3>>");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				quiz();
				break;
			case 2:
				insert();
				break;
			case 3:
				sc.close();
				System.out.println("������ �����մϴ�.");
				return;
			}
		}
	}

	public static void main(String[] args) {
		WordQuiz quiz = new WordQuiz("��ǰ����");
		quiz.run();
	}
}
