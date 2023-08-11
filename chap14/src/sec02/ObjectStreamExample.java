package sec02;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ObjectStreamExample {

	public static void main(String[] args) throws Exception {
		writeList(); // ��ü�� ���Ͽ� ����
		List<Board> list = readList(); // ���Ͽ��� ��ü�� �о��

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (Board board : list) {
			System.out.println(board.getBno() + "\t" + board.getTitle() + "\t" + board.getContent() + "\t"
					+ board.getWriter() + "\t" + sdf.format(board.getDate()));
		}
	}

	public static void writeList() throws Exception {
		List<Board> list = new ArrayList<>(); // main���� list�� ���� x : ���� ���� 

		list.add(new Board(1, "����1", "����1", "�۾���1", new Date())); // Board ��ü�� ������ ����Ʈ�� �߰�
		list.add(new Board(2, "����2", "����2", "�۾���2", new Date()));
		list.add(new Board(3, "����3", "����3", "�۾���3", new Date()));
		FileOutputStream fos = new FileOutputStream("c:/temp/board.db"); // ����
		ObjectOutputStream oos = new ObjectOutputStream(fos); // ����Ʈ�� ����ȭ
		oos.writeObject(list);
		oos.flush();
		oos.close();
	}

	public static List<Board> readList() throws Exception { // readList(); : ��ü ����Ʈ�� ������ȭ�� �о�� ��, �� ����Ʈ�� ��ȯ
		FileInputStream fis = new FileInputStream("c:/temp/board.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Board> list = (List<Board>) ois.readObject(); // objectŸ������ �о�� ��, BoardŸ������ ��ȯ ������� 
		return list;
	}
}