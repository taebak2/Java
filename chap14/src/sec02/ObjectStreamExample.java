package sec02;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ObjectStreamExample {

	public static void main(String[] args) throws Exception {
		writeList(); // 객체를 파일에 저장
		List<Board> list = readList(); // 파일에서 객체를 읽어옴

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (Board board : list) {
			System.out.println(board.getBno() + "\t" + board.getTitle() + "\t" + board.getContent() + "\t"
					+ board.getWriter() + "\t" + sdf.format(board.getDate()));
		}
	}

	public static void writeList() throws Exception {
		List<Board> list = new ArrayList<>(); // main구문 list랑 관련 x : 지역 변수 

		list.add(new Board(1, "제목1", "내용1", "글쓴이1", new Date())); // Board 객체를 생성해 리스트에 추가
		list.add(new Board(2, "제목2", "내용2", "글쓴이2", new Date()));
		list.add(new Board(3, "제목3", "내용3", "글쓴이3", new Date()));
		FileOutputStream fos = new FileOutputStream("c:/temp/board.db"); // 저장
		ObjectOutputStream oos = new ObjectOutputStream(fos); // 리스트를 직렬화
		oos.writeObject(list);
		oos.flush();
		oos.close();
	}

	public static List<Board> readList() throws Exception { // readList(); : 객체 리스트를 역직렬화해 읽어온 후, 그 리스트를 반환
		FileInputStream fis = new FileInputStream("c:/temp/board.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Board> list = (List<Board>) ois.readObject(); // object타입으로 읽어온 후, Board타입으로 변환 해줘야함 
		return list;
	}
}