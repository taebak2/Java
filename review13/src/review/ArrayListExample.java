package review;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("자바");
		list.add("jsp");
		list.add("html");
		
		int size = list.size();
		System.out.println(size);
		
		String str2="";	// 문자열 초기화
		for(String str : list) {	// list는 순회하려는 문자열 목록, 
			str2 += str + " ";		// str2는 각 요소가 결합되는 문자열
		}
		System.out.println(str2);
		
		Vector<Integer> v = new Vector<>();
		v.add(5);
		v.add(7);
		v.add(-3);
		
		v.add(2,40);	// 2번째 방에 들어가면 -3이 3번째 방으로 밀린다.
		int size2 = v.size();
		System.out.println(size2);
		
		// 모든 숫자 출력 
		// 모든 숫자 합계 출력
		
		for (int i = 0; i < size2; i++) {
			System.out.println(v.get(i));
		}
		
		int integer1 = 0;
		for (Integer integer : v) {	// 반복 가능한 객체를 순회하면서 각 요소에 접근하는 Java의 반복문
			integer1 +=integer;
		}
		System.out.println(integer1);
		
		int sum=0;
		for(int i=0; i<v.size(); i++) {
			int a = v.get(i);
			sum+=a;
		}
		System.out.println(sum);
	}
	
	

}
