package sec04;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService2 memberService = new MemberService2();
		boolean result = memberService.login("hong", "12345");
		
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			memberService.logout("hong");
			
		}else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
		

	}

}
