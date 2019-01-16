package Floor;
import java.util.HashMap;
import java.util.*;
import Vehicle.*;
//HashMap<Role, Queue<Employee>> attendee;
public class Floor {
	public int level;
	public HashMap<Integer, ArrayList<Block>> location;
	public int row;
	public int col;
	public Floor(int row, int col) {
		this.row = row;
		this.col = col;
		this.location = new HashMap<Integer, ArrayList<Block>>();
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
		Block block = new Block(row, col);
		//System.out.println("================block"+ block.row + " col"+ block.col);
		this.location.get(row).add(block);	
		// if(this.isBlockExist(row, col)) {
		// 	System.out.println("Block Already Exist on the row number ::"+ row +" and column::"+col);
		// }
		// else {
		// 	this.location.get(row).add(new Block(row, col));	
		// }
	}
	
	public void updateBlock(Block block) {
		this.location.get(block.row).add(block.col, block);
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
		//System.out.println("Search Free Spache::"+this.level);
		for(int row = 0; row < this.row; row++) {
			//System.out.println("Floor::"+this.level + " row number::"+row + " and size::"+this.location.get(row).size());
			int count = 0;
			int index = 0;
			for(Block block : this.location.get(row)) {
				index += 1;
				if(block.getBlockStatus()) {
					count += 1;
				}
				else {
					count = 0;
				}
				//System.out.println("count=="+count + " size="+vehicle.size);
				if(count == vehicle.size) {
					//System.out.println("**********Available block********"+block.col);
					return this.getBlock(row, index - vehicle.size);
					//return block;
				}
			}
		}
		return null;
	}

	public void fillFreeSpace(Block block, Vehicle vehicle) {
		System.out.println(block.col + vehicle.size+"  block row "+block.row + " col "+ block.col + " Vehicle "+vehicle.vechileType);
		for(int i = block.col; i < block.col + vehicle.size; i++) {
			//System.out.println("i="+i);
			Block freeBlock = this.location.get(block.row).get(i);
			freeBlock.setBlockStatus(false);
			//this.updateBlock(freeBlock);
		}
	}

	public void removeVehicle(Block block, Vehicle vehicle) {
		for(int i = block.col; i< vehicle.size; i++) {
			Block freeBlock = this.location.get(block.row).get(i);
			freeBlock.setBlockStatus(true);
			//this.updateBlock(freeBlock);
		 }
	}
}