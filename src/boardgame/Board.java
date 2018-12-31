package boardgame;

public class Board {

	private int rows;
	private int column;
	private Piece[][] pieces;
	
	public Board() {
	}

	public Board(int rows, int column) {
		super();
		this.rows = rows;
		this.column = column;
		pieces = new Piece[rows][column];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	public Piece piece(int row, int column) { // retorna um objeto do tipo Piece e o nome e piece
		return pieces[row][column];
	}
	
	public Piece piece(Position position) { // retorna um objeto do tipo Piece e o nome e piece recebe a posi��o
		return pieces[position.getRow()][position.getColumn()];
	}
	
}
