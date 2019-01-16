package Floor;
import java.util.*;

public class Block {
	boolean free;
	public int row;
	public int col;

	public Block(int row, int col){
		this.free = true;
		this.row = row;
		this.col = col;

	};
	public void setBlockStatus(boolean free) {
		this.free = free;
	}
	public boolean getBlockStatus() {
		return this.free;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getRow() {
		return this.row;
	}

	public void setCol(int col) {
		this.col = col;
	}
	public int getCol() {
		return this.col;
	}
}