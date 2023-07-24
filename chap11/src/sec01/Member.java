package sec01;

public class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Member) { // instanceof ��ü Ÿ�� Ȯ���ϴ� ������ : ����ȯ ���� ���θ� Ȯ���ϸ� true / false�� ��ȯ
			Member member = (Member) obj; // �Ű����� Ÿ��(Object obj)�� Member Ÿ������ ���� ��ȯ
			if (id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}

}
