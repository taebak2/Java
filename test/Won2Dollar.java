package test;

public class Won2Dollar extends Converter{
int num;
	public Won2Dollar(int i) {
}

	protected double convert(double src) {
		return src/1200;
	}

	protected String getSrcString() {
		return "��";
	}

	protected String getDestString() {
		return "�޷�";
	}

	public void run() {
		super.run();
	}

}
