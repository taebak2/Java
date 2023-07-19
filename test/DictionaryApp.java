package test;


public class DictionaryApp {
	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10); // 배열 
		dic.put("홍길동", "자바");
		dic.put("김길동", "파이선");
		dic.put("김길동", "C"); // 김길동의 값을 C로 수정
		System.out.println("홍길동의 값은 " + dic.get("홍길동"));
		System.out.println("김길동의 값은 " + dic.get("김길동"));
		dic.delete("홍길동"); // 홍길동 아이템 삭제
		System.out.println("홍길동의 값은 " + dic.get("홍길동")); // 삭제된 아이템 접근
	}

}
