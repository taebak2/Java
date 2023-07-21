package sec01;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) { 

		String[] a = new String[10];

		a[0] = "가나다";
		String data1 = a[0];
		System.out.println("a[0]:" + data1);

		String data2 = args[0]; // args라는 배열을 생성하지 않고 배열에 있는 값을 대입함
		String data3 = args[1]; // 이대로 출력하면 ArrayIndexException 발생(배열에서 인덱스 범위 초과한 오류)
		String data4 = args[2];
		System.out.println(data2);
		System.out.println(data3);
		System.out.println(data4);
	}

}
