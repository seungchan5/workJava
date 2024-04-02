package library;

import java.lang.ProcessHandle.Info;
import java.util.List;
import java.util.Iterator;
import library.dao.Dao;
import library.dao.FileDao;
import library.vo.Book;

public class Library {
	List<Book> list = null;
	Dao dao = new FileDao();
	
	public Library() {
		list = dao.getList();
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		String info = "";
	
		for(Book book : list) {
			info += book.info() + "\n";
		}
		return info;
	}
	
	
	public boolean insertBook(int no, String title, String author, boolean isRent) {
		Book book = new Book(no, title, author, isRent);
		list.add(book);
		boolean res = dao.listToFile(list);
		if(!res) {
			list.remove(book);
			return false;
		}
		System.out.println(toString());
		return true;
	}
	
	public boolean deleteBook(int no) {
		for(Book book : list) {
			if(book.getNo()==no) {
				list.remove(book);
				boolean res =dao.listToFile(list);
				if(!res) {
					list.add(book);
					return false;
				}
				System.out.println(toString());
				return true;
			}
		}
		return false;
	}
	
	public boolean rentBook(int no) {
		for(Book book : list) {
			if(book.getNo()==no) {
				if(!book.isRent()) {
					book.setRent(true);
					boolean res = dao.listToFile(list);
					if(!res) {
						book.setRent(false);
					}
					System.out.println(toString());
					return true;
				}
					
			}
		}
		return false;
	}
	
	public boolean returnBook(int no) {
		for(Book book : list) {
			if(book.getNo() == no) {
				if(book.isRent()) {
					book.setRent(false);
					dao.listToFile(list);
					System.out.println(toString());
					return true;
				} else {
					return false;
				}
			}
		}
		
		return false;
	}
}
