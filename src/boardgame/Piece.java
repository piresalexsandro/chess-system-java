package boardgame;

public class Piece {

	protected Position position;    //agrega��o
	private Board board;    // agrega��o
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
	
	
	
}
