package sunmin.spring.service;

import java.util.List;

import sunmin.spring.vo.Book;

public interface BookService {

	void newBook();

	List<Book> readAllBook();

	void readOneBook(int bookid);

	void modifyBook(Book b);

	void removeBook(int bookid);
		

}
