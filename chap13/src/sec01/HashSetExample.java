package sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("자바");
		set.add("제이디비씨");
		set.add("서블릿");
		set.add("자바");
		set.add("아이바티스");
		set.add("제이디비씨"); // Java는 한 번만 저장됨

		int size = set.size();
		System.out.println("총 객체수: " + size);

		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) { // hasNext는 boolean타입 true or false로 반환
			String element = iter.next();
			System.out.println(element);
		}
		
		iter = set.iterator();
		for (String element : set) { // set의 객체를 element에 넣기
			System.out.println(element);
		}
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어있음");
		}
	}

}
