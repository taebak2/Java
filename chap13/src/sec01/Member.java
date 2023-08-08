package sec01;

public class Member {
	public String name;
	public int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() { // name과 age값이 같으면 동일한 hashCode를 리턴
				// hashCode()는 보통 equals와 함께 오버라이드함
		return name.hashCode() + age;
	}

	@Override
	public boolean equals(Object obj) { // name과 age값이 같으면 true 리턴
		if (obj instanceof Member) { // 형변환 체크
			Member member = (Member) obj; // 형변환(다운캐스팅) 
						      // Member 객체 생성 해줘야 return값을 받을 수 있기 때문에 꼭 생성해줘야한다.
			return member.name.equals(name) && (member.age == age); // Member 객체 생성 해줘야 return값을 받을 수 있기 때문에 꼭 생성해줘야한다.
		} else {
			return false;
		}
	}
}
