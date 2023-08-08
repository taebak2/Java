package sec01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(); // List 타입이 int인 경우 Integer로 해야함
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		// 2번째 방에 Database 추가하면 원래 있던 Servlet이 밀려서 3번이 됨

		list.add("iBATIS");

		int size = list.size(); // size를 int로 변경한 이유...?
		System.out.println("총 객체 수 : " + size);

		String skill = list.get(2); // 2번방의 데이터 타입이 String이기 때문에 String 써줘야함
		System.out.println("2 : " + skill);

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str); // list에 있는 데이터 출력
		}

		list.remove(2); // 2번째 방 데이터 삭제(Database)
		list.remove(2); // 2번째 방 데이터 삭제(3번방의 Servlet이 2번방의 데이터인 Database의 삭제로 인해 당겨짐)
		list.remove("iBATIS"); // 내용으로 삭제 가능
	}
}
