package sunmin.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sunmin.spring.service.BookService;
import sunmin.spring.vo.Book;

public class BookJDBCApp02 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springjdbc02.xml");
		BookService bsrv = (BookService) ctx.getBean("bsrv02");
		
		// 책 정보 등록
		// bsrv.newBook();
		
		// 책 정보 조회
		// bsrv.readAllBook();
		
		// 책 정보 상세조회
		// bsrv.readOneBook(100);
		
		// 책 정보 수정
		// Book b = new Book("12", "스프링활용", "아카데미", 12000);
		// bsrv.modifyBook(b);
		
		// 책 정보 삭제
		bsrv.removeBook(123);

	}

}
