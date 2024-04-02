package library.dao;

import java.util.List;

import library.vo.Book;

public interface Dao {
	List<Book> getList();
	
	boolean listToFile(List<Book> list);
}
