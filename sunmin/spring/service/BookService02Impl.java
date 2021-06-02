package sunmin.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sunmin.spring.dao.BookDAO;
import sunmin.spring.vo.Book;

@Service("bsrv02")
public class BookService02Impl implements BookService {
	
	@Autowired
	private BookDAO bdao02;

	@Override
	public void newBook() {
		Book b = new Book("100", "스프링5기초", "더조은", 50000);
		int cnt = bdao02.insertBook(b);
		if (cnt > 0) System.out.println("도서 등록 완료!");
	}

	@Override
	public List<Book> readAllBook() {
		StringBuffer sb = new StringBuffer();
		List<Book> bs = bdao02.selectAllBook();
		
		for (Book b : bs) sb.append(b);
		System.out.println(sb);
		
		return null;
	}

	@Override
	public void readOneBook(int bookid) {
		Book b = bdao02.selectOneBook(bookid);
		System.out.println(b);

	}

	@Override
	public void modifyBook(Book b) {
		int cnt = bdao02.updateBook(b);
		if (cnt > 0) System.out.println("수정완료!");
		
	}

	@Override
	public void removeBook(int bookid) {
		int cnt = bdao02.deleteBook(bookid);
		if (cnt > 0) System.out.println("삭제완료!");
	}

}
