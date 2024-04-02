package connection;

import java.security.PublicKey;
import java.util.Date;

public class Book {
	int no;
	String title;
	String author;
	String isRent;
	Date regDate;
	Date editDate;
	
	
	public Book(int no, String title, String author, String isRent, Date regDate, Date editDate) {
		super();
		this.no = no;
		this.title = title;
		this.author = author;
		this.isRent = isRent;
		this.regDate = regDate;
		this.editDate = editDate;
	}
	
	@Override
	public String toString() {
		return getNo() + " "+ getTitle() + " " + getAuthor() + " " + getIsRent() + " " + getRegDate() + " " + getEditDate() ;
	}
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsRent() {
		return isRent;
	}

	public void setIsRent(String isRent) {
		this.isRent = isRent;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getEditDate() {
		return editDate;
	}

	public void setEditDate(Date editDate) {
		this.editDate = editDate;
	}


}
