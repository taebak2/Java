package sec02;

public class 멤버예제3 {

	public static void main(String[] args) {
		Member member = new Member();
		member.name = "최하얀"; // 최하얀은 필드값..
		member.age = 23;
		
		System.out.println(member.name);
		System.out.println(member.age);
	}

}
