package sec01;

import java.util.ArrayList;
import java.util.List;

public class GesipanExample {

	public static void main(String[] args) {

		List<Gesipan> list = new ArrayList<>(); // Gesipan 클래스 전체가 리스트에 들어감

		list.add(new Gesipan(1, "8월초수업일정", "자바개인프로젝트발표", "홍길동"));
		list.add(new Gesipan(2, "9월초수업일정", "데이터베이스", "홍길동"));
		list.add(new Gesipan(3, "10월초수업일정", "JSP", "홍길동"));
		list.add(new Gesipan(4, "11월초수업일정", "팀프로젝트준비", "홍길동"));

		for (int i = 0; i < list.size(); i++) {
			Gesipan gesi = list.get(i);
			
			System.out.println(list.get(i)); // list 주소값 출력
			System.out.println(gesi.number + " " + gesi.subject + " " + gesi.content + gesi.user);
		}
	}

}
