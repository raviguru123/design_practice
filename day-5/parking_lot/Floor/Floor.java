package Floor;
import java.util.HashMap;
import java.util.*;
import Vehicle.*;
//HashMap<Role, Queue<Employee>> attendee;
public class Floor {
	int level;
	HashMap<Integer, ArrayList<Block>> location;
	public Floor(int row, int col) {
		for(int i = 0 ; i < row; i++) {
			this.location.put(i, new ArrayList<Block>());
			for(int j = 0; j < col; j++) {
				this.addBlock(i, j);
			}
		}
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getLevel() {
		return this.level;
	}

	public void addBlock(int row) {
		int col;
		if(this.location.containsKey(row)) {
			col = this.location.get(row).size();
		}
		else {
			col = 0;
		}
		
		this.addBlock(row, col);	
	}
	public boolean isBlockExist(int row, int col) {
		if(this.location.containsKey(row) && this.location.get(row).size() >=col) {
			return true;
		}
		return false;
	}

	public void addBlock(int row ,int col) {
		if(this.isBlockExist(row, col)) {
			System.out.println("Block Already Exist on the row number ::"+ row +" and column::"+col);
		}
		else {
			this.location.get(row).add(new Block(row, col));	
		}
		
	}
	public Block getBlock(int row, int col) {
		if(isBlockExist(row, col)) {
			return this.location.get(row).get(col);
		}
		else {
			System.out.println("Block not Exist");
			return null;
		}
	}

	public Block searchFreeSpace(Vehicle vehicle) {
		for(int key : this.location.keySet()) {
			int count = 0;
			for(Block block : this.location.get(key)) {
				if(block.getBlockStatus()) {
					count += 1;
				}
				else {
					count = 0;
				}
				if(count == vehicle.size) {
					return block;
				}
			}
		}
		return null;
	}
}