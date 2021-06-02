package sunmin.spring.dao;

import java.util.List;

import sunmin.spring.vo.Book;

public interface BookDAO {

	int insertBook(Book b);

	List<Book> selectAllBook();

	Book selectOneBook(int bookid);

	int updateBook(Book b);

	int deleteBook(int bookid);

	
	

}
