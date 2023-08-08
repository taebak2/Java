package sec01;

public class Member {
	public String name;
	public int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() { // name�� age���� ������ ������ hashCode�� ����
		return name.hashCode() + age;
	}

	@Override
	public boolean equals(Object obj) { // name�� age���� ������ true ����
		if (obj instanceof Member) { 	// instanceof : true or false�� ��ȯ
										// obj�� Member�� ���ϴ��� Ȯ��
										
			
		Member member = (Member) obj;	// Member ��ü ���� ����� return���� ���� �� �ֱ� ������ �� ����������Ѵ�.
		return member.name.equals(name) && (member.age == age); 
		} else {
		return false;
		}
	}
}
