package sec01;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	public List<Board1> getBoardList() {
		List<Board1> list =new ArrayList<>();
		list.add(new Board1("����1", "����1"));
		list.add(new Board1("����2", "����2"));
		list.add(new Board1("����3", "����3"));
		return list;
	}
}
