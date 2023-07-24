package sec01;

public class MyPoint {
	int num1;
	int num2;

	public MyPoint(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public String toString() {
		return "Point(" + num1 + ", " + num2 + ")";
	}

	@Override
	public boolean equals(Object obj) {
		MyPoint p = (MyPoint) obj;
		if (num1 == p.num1 && num2 == p.num2) {
			return true;

		}
		return false;
	}

}
