package test;

public class Km2Mile extends Converter {

	
	
	public Km2Mile(double d) {
	}


	protected double convert(double src) {
		return src/1.6;
	}

	protected String getSrcString() {
		return "Km";
	}

	protected String getDestString() {
		return "mile";
	}

	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6); // 1∏∂¿œ¿∫ 1.6km
		toMile.run();
	}
}
