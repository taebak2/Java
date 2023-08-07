package sec01;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		List<Board> list = new Vector<>(); // Vector vs ArrayList : ���ʹ� �������� �Ұ���(Synchronized) 

		list.add(new Board("����1", "����1", "�۾���1"));
		list.add(new Board("����2", "����2", "�۾���2"));
		list.add(new Board("����3", "����3", "�۾���3"));
		list.add(new Board("����4", "����4", "�۾���4"));
		list.add(new Board("����5", "����5", "�۾���5"));

		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
		
		for(Board board2 : list) {
			System.out.println(board2.subject + "\t" + board2.content + "\t" + board2.writer);
		}
	}

}
