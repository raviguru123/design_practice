import Vehicle.*;
import Floor.*;

public class Location {
	int   floor;
	Block block;
	Vehicle vehicle;

	public Location(int floor, Block block) {
		this.floor = floor;
		this.block = block;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}
	public void selBlock(Block block) {
		this.block = block;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public int getFloor() {
		return this.floor;
	}

	public Block getBlock() {
		return this.block;
	}

	public Vehicle getVehicle() {
		return this.vehicle;
	}
}