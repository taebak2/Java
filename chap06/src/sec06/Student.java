package sec06;

import java.util.Scanner;

public class Student {
	private String name = "홍길동"; // 학생 이름
	private String code = "A123"; // 학번
	private int middleScore; // 중간고사 점수
	private int finalScore; // 기말고사 점수
	private double avg; // 평균점수

	final String id = "admin";
	final int password = 1234;

	Scanner s = new Scanner(System.in);

	public boolean checkLogin() {
		
		System.out.println("아이디를 입력하세요");
		String id = s.next();
		System.out.println("비밀번호를 입력하세요");
		int pw = s.nextInt();
		
		if (this.id.equals(id) && this.password == pw) {
			return true;
		} else {
			return false;
		}
	}

	public void inputExam() {
		System.out.println("중간고사 성적을 입력하세요");
		setMiddleScore(s.nextInt());
		System.out.println("기말고사 성적을 입력하세요");
		setFinalScore(s.nextInt());
		double avg = (getMiddleScore() + getFinalScore()) / 2;
		setAvg(avg);
		System.out.println("평균 성적은" + getAvg());

	}

	public String getName() { 
		return name;
	}

	public void setName(String name) {		
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getMiddleScore() {
		return middleScore;
	}

	public void setMiddleScore(int middleScore) {
		this.middleScore = middleScore;
	}

	public int getFinalScore() {
		return finalScore;
	}

	public void setFinalScore(int finalScore) {
		this.finalScore = finalScore;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

}
