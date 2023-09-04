package dto;

import java.util.ArrayList;

public class BookRepository {

	private ArrayList<Book> list = new ArrayList<Book>();

	public BookRepository() {

		Book book1 = new Book();
		book1.setAuthor("무라카미 하루키");
		book1.setBookName("도시와 그 불확실한 벽");
		book1.setBookPrice(17550);

		Book book2 = new Book();
		book2.setAuthor("조국");
		book2.setBookName("디케의 눈물");
		book2.setBookPrice(16920);

		Book book3 = new Book();
		book3.setAuthor("메르");
		book3.setBookName("1%를 읽는 힘");
		book3.setBookPrice(19800);

		list.add(book1);
		list.add(book2);
		list.add(book3);

	}

	public ArrayList<Book> getAllBooks() {
		return list;
	}
}
