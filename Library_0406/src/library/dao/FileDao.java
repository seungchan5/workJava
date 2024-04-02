package library.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import library.vo.Book;

public class FileDao implements Dao {

	@Override
	public List<Book> getList() {
		List<Book> list = new ArrayList<>();
		try (FileReader fr = new FileReader("bookList.txt");BufferedReader br = new BufferedReader(fr)) {
			String readLine = "";
			while((readLine = br.readLine()) != null) {
				Book book = makeBook(readLine);
				if(book != null) {
					list.add(book);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return list;
	}
	
	private Book makeBook(String readLine) {
		try {
			String[] strArry = readLine.split(" ");
			int no = Integer.parseInt(strArry[0]);
			String title = strArry[1];
			String author = strArry[2];
			boolean isRent = Boolean.parseBoolean(strArry[3]);
			
			Book book = new Book(no, title, author, isRent);
			
			return book;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}
	
	@Override
	public boolean listToFile(List<Book> list) {
		try (FileWriter fw = new FileWriter("bookList.txt");) {
			
			for(Book book : list) {
				fw.write(book.toString()+"\n");
			}
			
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
