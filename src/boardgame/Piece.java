package boardgame;

public class Piece {

	private Board board;
	protected Position position;
	
	public Piece(Board board) {
		this.board = board;
	}

	protected Board getBoard() {
		return board;
	}
	
}