package library.vo;

public class Book {
	private int no;
	private String title;
	private String author;
	private boolean isRent;
	
	public Book(int no, String title, String author, boolean isRent) {
		this.no = no;
		this.title = title;
		this.author = author;
		this.isRent = isRent;
	}
	
	@Override
	public String toString() {
		return getNo()+ " " + getTitle() + " "+ getAuthor() + " "+ isRent;
	}
	
	public String info() {
		String str = "";
		if(isRent) {
			str = "대여중";
		}
		return getNo()+ " " + getTitle() + " "+ getAuthor() + " "+ str;
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

	public boolean isRent() {
		return isRent;
	}

	public void setRent(boolean isRent) {
		this.isRent = isRent;
	}
}
