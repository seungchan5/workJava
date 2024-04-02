package board.jungang;

public class BoardMain {

	public static void main(String[] args) {
		
		// 배열의 방을 만들기
		// 타입을 명시해야 한다.
		// 배열은 같은 타입을 여러개 저장하는 자료구조
//		int[] intArr1 = {1,2,3,4,5};
		// 기본값으로 초기화
		// 0 0 0 0 0
		// 방번호(index)는 0부터 시작해서 방의갯수-1까지
		int[] intArr = new int[5];
		intArr[0] = 5;
		intArr[1] = 4;
		intArr[2] = 3;
		intArr[3] = 2;
		intArr[4] = 1;
		
		// 타입[] 변수이름 = new 타입[방의갯수];
		// null null null null null
		Board[] boardArr = new Board[5];
		
		// board객체를 생성하여 boardArr배열 0번째 index에 넣어준다.
		// board board board board board
		boardArr[0] = new Board("게시글1", "홍길동");
		boardArr[1] = new Board("게시글2", "홍길동");
		boardArr[2] = new Board("게시글3", "홍길동");
		boardArr[3] = new Board("게시글4", "홍길동");
		boardArr[4] = new Board("게시글5", "홍길동");
		
		for(Board board : boardArr) {
			System.out.println("=================");
			System.out.println(board.title);
			System.out.println(board.content);
			System.out.println(board.writer);
			System.out.println(board.date);
			System.out.println(board.hitcount);
			System.out.println("=================");
			
		}
		
		
		
	}

}
