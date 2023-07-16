package sec03;
import java.util.Scanner;

public class 끝말잇기정답 {

	Scanner s=new Scanner(System.in); 
	private String startWord = "아버지"; // 시작 단어
	private Player[] players; // 게임 참가자들
	

	public static void main(String[] args) {
		끝말잇기정답 game = new 끝말잇기정답();
		game.run();
	}

	// 게임을 진행하는 메소드
	public void run() {
		System.out.println("끝말잇기 게임을 시작합니다...");
		createPlayers(); // 참가자를 위한 Player []을 생성한다.
		String lastWord = startWord; // startWord에서 부터 시작한다.

		System.out.println("시작하는 단어는 " + lastWord + "입니다");
		int next = 0; // 참가자들의 순서대로 증가

		// 게임이 끝날 때까지 루프
		while (true) {
			String newWord = players[next].getWordFromUser(); 
			// next 참가자가 단어를 말하도록 한다.
			if (!players[next].checkSuccess(lastWord)) { // next 참가자가 성공하였는지 검사.
				System.out.print(players[next].getName() + "이 졌습니다.");
				break; // 게임을 종료한다.
			}
			next++; // 다음 참가자
			next %= players.length; // next가 참가자의 개수보다 많게 증가하는 것을 막는다. ex) 참가자 5명 next 0부터 1씩 증가 = 나머지 0,1,2,3,4,다시 0,1,2,3,4
			lastWord = newWord;
		}
	}

	// 게임 참가자 수를 입력받고 Player []을 생성하는 메소드
	private void createPlayers() {
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		int nPlayers = s.nextInt();
		players = new Player[nPlayers]; // Player 클래스 타입의 배열 생성

		// 각 참여자의 이름을 입력받아 Player 객체 생성
		for (int i = 0; i < nPlayers; i++) {
			System.out.print("참가자의 이름을 입력하세요>>");
			String name = s.next();
			players[i] = new Player(name);
		}
	}

}

// 한 사람의 참가자를 표현하는 클래스
class Player {
	private Scanner scanner; // 키보드 입력
	private String name; // 게임 참가자의 이름
	private String word; // 참가자가 말한 단어

	public Player(String name) {
		this.name = name;
		scanner = new Scanner(System.in);
	}

	public String getName() {
		return name;
	}

	public String getWordFromUser() {
		System.out.print(name + ">>");
		word = scanner.next();
		return word;
	}

	// lastWord와 참가자가 말한 word를 비교하여 끝말잇기가 잘되었는지 판단.
	// 성공하였으면 true 리턴
	public boolean checkSuccess(String lastWord) {
		int lastIndex = lastWord.length() - 1; // 최종 단어의 맨 마지막 문자의 인덱스

		// 최종 단어의 맨 마지막 문자와 참가자가 말한 단어의 첫 문자가 같은지 비교
		if (lastWord.charAt(lastIndex) == word.charAt(0))
			return true;
		else
			return false;
	}

}
