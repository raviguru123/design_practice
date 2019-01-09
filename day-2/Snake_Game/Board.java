public class Board {
	private int ROW_COUNT, COL_COUNT;
	private Cell[][] cells;

	public Board(int ROW_COUNT, int COL_COUNT) {
		this.ROW_COUNT = ROW_COUNT;
		this.COL_COUNT = COL_COUNT;

		this.cells = new Cell[ROW_COUNT][COL_COUNT];

		for(int row = 0 ; row < ROW_COUNT; row++) {
			for(int col = 0 ; col < COL_COUNT; col++) {
				this.cells[row][col] = new Cell(row, col);
			}
		}
	}

	public void setCells(Cell[][] cells) {
		this.cells = cells;
	} 

	public Cell[][] getCells() {
		return this.cells;
	}

	public void generateFood() {
		int row = (int) (Math.random() * this.ROW_COUNT);
		int col = (int) (Math.random() * this.COL_COUNT);
		this.cells[row][col].setCellType(CellType.FOOD);
		System.out.println("Food is Genrated at :: "+row+ " col::"+col);
	}

}