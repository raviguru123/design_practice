public class Cell {
	public int row;
	public int col;
	CellType celltype;

	public Cell(int row, int col) {
		this.row = row;
		this.col = col;
	}

	public void setCellType(CellType celltype) {
		this.celltype = celltype;
	}

	public CellType getCellType() {
		return this.celltype;
	}

	public int getRow() {
		return this.row;
	}

	public int getCol() {
		return this.col;
	}
}