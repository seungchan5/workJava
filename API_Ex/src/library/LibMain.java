package library;

public class LibMain {
	public static void main(String[] args) {
		Library lib = new Library();
		lib.addBook();
		System.out.println(lib.toString());
	}
}
