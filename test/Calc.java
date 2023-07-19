package test;

public abstract class Calc {
	int a;
	int b;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	};

	abstract int calculate(); // void가 아닌 abstract로 한 이유는 최종 출력을 calculator에서 하기 위함..

}
