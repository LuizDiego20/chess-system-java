package boardgame;

public class Position {

	private Integer row;
	private Integer column;
	
	public Position() {
	}
	
	public Position(Integer row, Integer column) {
		this.row = row;
		this.column = column;
	}
	
	public Integer getRow() {
		return row;
	}
	
	public void setRow(Integer row) {
		this.row = row;
	}
	
	public Integer getcolumn() {
		return column;
	}
	
	public void setcolumn(Integer column) {
		this.column = column;
	}
	
	@Override
	public String toString() {
		return "Position [row=" + row + ", column=" + column + "]";
	}
	
}