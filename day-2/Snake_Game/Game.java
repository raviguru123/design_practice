public class Game {
	public static final int DIRECTION_NONE = 0, DIRECTION_RIGHT = 1,  
         DIRECTION_LEFT = -1, DIRECTION_UP = 2, DIRECTION_DOWN = -2;
    public Board board;
    public Snake snake;
    public int direction;
    public boolean gameover;

    public Game(Snake snake, Board board) {
    	this.snake = snake;
    	this.board = board;
    }

    public void update() {
    	if(!this.gameover) {
    		if(this.direction != DIRECTION_NONE) {
    			Cell nextcell = this.getNextCell(this.snake.getHead());
    			if(this.snake.checkCrash(nextcell)) {
    				this.gameover = true;
    			}
    			else {
    				this.snake.move(nextcell);
    				if(nextcell.celltype == CellType.FOOD) {
    					this.snake.grow(nextcell);
    					this.board.generateFood();
    				}
    			}
    		}
    	}
    }

    public Cell getNextCell(Cell cell) {
    	int row = cell.getRow();
    	int col = cell.getCol();
    	if(this.direction == DIRECTION_RIGHT) {
    		col++;
    	}

    	if(this.direction == DIRECTION_LEFT) {
    		col--;
    	}

    	if(this.direction == DIRECTION_UP) {
    		row--;
    	}

    	if(this.direction == DIRECTION_DOWN) {
    		row++;
    	}

    	return this.board.getCells()[row][col];
    }

}