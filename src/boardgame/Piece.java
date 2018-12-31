package boardgame;

public class Piece {

	protected Position position;    //agregação
	private Board board;    // agregação
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
	
	
	
}
