package sec02.exam04;

public class 문자연습2 {

	public static void main(String[] args) {
		String name = "장동건";
		String job = "배우";
		System.out.println(name + "은 " + job + "입니다.");
		// int + 는 연산, 문자열 String + 이어짐

		String str = "나는 \"자바\"를 좋아합니다."; // 문자열 내부에 특정 문자를 포함 = 역슬래시 \
		System.out.println(str);

		String str2 = "번호\t이름\t나이"; // \t = tab
		System.out.println(str2);

		String str3 = "번호\n이름\n나이"; // \n = new line
		System.out.println(str3);
	}

}
