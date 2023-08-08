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

		Iterator<String> iter = set.iterator(); // iterator는 반복자
							// set은 순서가 없기 때문에 iterator를 사용해야한다.
		while (iter.hasNext()) { // hasNext는 boolean타입 true or false로 반환
			String element = iter.next();
			System.out.println(element);
		}
		
		iter = set.iterator();
		for (String element : set) { // element = set 타입 자료 크기만큼 출력 
			System.out.println(element);
		}
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어있음");
		}
	}

}
