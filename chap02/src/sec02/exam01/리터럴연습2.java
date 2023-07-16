package sec02.exam01;

public class 리터럴연습2 {

	public static void main(String[] args) {
		byte var1 = 115;
		byte var2 = 0;
		// byte 범위 벗어남 (-128~127) byte var3 = 128;
		byte var3 = 127;

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
		//bit < byte < short < int < long , char < int 
		
		long var4 = 12345678L;
		//long var5 = 1000000000000;  long type 표현할 때 L 입력
		long var5 = 1000000000000L;
		long var6 = 1000000000000L;
		
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
	}

}
