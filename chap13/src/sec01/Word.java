package sec01;


public class Word {
	private String english; // 한글
	private String korean; // 영어

	public Word(String english, String korean) {
		this.english = english;
		this.korean = korean;
	}

	public String getEnglish() {
		return english;
	}

	public String getKorean() {
		return korean;
	}

}
