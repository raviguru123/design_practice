import java.util.LinkedList;

public class Snake {
	private LinkedList<Cell> snakePartList = new LinkedList<Cell>();
	private Cell head;

	public Snake(Cell initPos) {
		this.head = initPos;
		this.snakePartList.add(initPos);
	}

	public void grow(Cell cell) {
		this.snakePartList.add(cell);
	}

	public void move(Cell nextCell) {
		System.out.println("Snake is Moving :: row=>"+nextCell.getRow()+ " And Col=>"+nextCell.getCol());
		Cell tail = this.snakePartList.removeLast();
		tail.celltype = CellType.EMPTY;
		this.head = nextCell;
		this.snakePartList.add(this.head);
	}

	public boolean checkCrash(Cell nextCell) {
		System.out.println("Checking Crash");
		for(Cell cell : this.snakePartList) {
			if(nextCell == cell) {
				return true;
			}
		}
		return false;
	}

	public LinkedList<Cell> getSnakePartList() {
		return this.snakePartList;
	}

	public void setSnakePartList(LinkedList<Cell> snakePartList) {
		this.snakePartList = snakePartList;
	}

	public Cell getHead() {
		return this.head;
	}

	public void setHead(Cell head) {
		this.head = head;
	} 

}