package sec04;

public class MemberService2 {
	String id;
	String password;

	boolean login(String id, String passworwd) {
		if (id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}

	void logout(String id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
}
