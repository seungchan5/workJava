package getter.setter;

public class SingletonMain {

	public static void main(String[] args) {
		SingletonEx ex = SingletonEx.getInstance();
		SingletonEx ex1 = SingletonEx.getInstance();
		SingletonEx ex2 = SingletonEx.getInstance();
		SingletonEx ex3 = SingletonEx.getInstance();
		SingletonEx ex4 = SingletonEx.getInstance();
		
		// 같은 주소를 갖고 있는지 확인
		if(ex == ex1) {
			System.out.println("같은 객체");
		} else {
			System.out.println("다른 객체");
		}
	}

}
