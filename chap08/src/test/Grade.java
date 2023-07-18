package test;

public class Grade {
	private int math;
	private int science;
	private int english;
	

	public int getMath() {
		return math;
	}

	public int getScience() {
		return science;
	}

	public int getEnglish() {
		return english;
	}

	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}

	public int average() {
		int average = (getMath() + getScience() + getEnglish()) / 3;
		return average;
	}


	}


