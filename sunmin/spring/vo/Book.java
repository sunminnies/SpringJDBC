package sunmin.spring.vo;

public class Book {
	protected String bookid;
	protected String bookname;
	protected String publish;
	protected int price;
	
	public Book() { }

	public Book(String bookid, String bookname, String publish, int price) {
		this.bookid = bookid;
		this.bookname = bookname;
		this.publish = publish;
		this.price = price;
	}

	public String getBookid() {
		return bookid;
	}

	public void setBookid(String bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append(bookid).append(" ");
		sb.append(bookname).append(" ");
		sb.append(publish).append(" ");
		sb.append(price).append("\n");
		
		return sb.toString();
	}
	
	

}
