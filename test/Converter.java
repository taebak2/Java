package test;

import java.util.Scanner;

public abstract class Converter {
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	public void run() {
		Scanner s = new Scanner(System.in);
		System.out.println(getSrcString()+"�� "+getDestString()+"�� �ٲߴϴ�.");
	      System.out.print(getSrcString()+"�� �Է��ϼ���>> ");
	      double val = s.nextDouble();
	      double res = convert(val);
	      System.out.println("��ȯ ���: "+res+getDestString()+"�Դϴ�");
	      s.close();
	}
	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
	}

}
