package sec02;

public class IncreaseDecreaseOperatiorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;

		System.out.println("-----------------");
		x++; // x = 10 출력시 + 
		++x; // x = 11
		System.out.println("x=" + x); // x= 12

		System.out.println("-----------------");
		y--; // y = 10 출력시 -
		--y; // y = 9
		System.out.println("y=" + y); // y = 8

		System.out.println("-----------------");
		z = x++; // z = 12
		System.out.println("z=" + z); // z = 12
		System.out.println("x=" + x); // x = 13

		System.out.println("-----------------");
		z = ++x; // z = 14
		System.out.println("z=" + z); // z = 14
		System.out.println("x=" + x); // x = 14
		System.out.println("-----------------");
		z = ++x + y++; // 15 + 8
		System.out.println("z=" + z); // 23
		System.out.println("x=" + x); // 15
		System.out.println("y=" + y); // 9

	}

}
