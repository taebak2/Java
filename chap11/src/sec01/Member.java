package sec01;

public class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Member) { // instanceof 객체 타입 확인하는 연산자 : 형변환 가능 여부를 확인하며 true / false로 반환
			Member member = (Member) obj; // 매개변수 타입(Object obj)을 Member 타입으로 강제 변환
			if (id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}
