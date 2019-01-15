package Vehicle;

public abstract class Vehicle{
	public String name;
	public int size;
	public VehicleType vechileType;
	public String vechileNumber;

	public void setName(String name) {
		this.name = name;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void setNumber(String vechileNumber) {
		this.vechileNumber = vechileNumber;
	}


	public String getName() {
		return this.name;
	}
	public int getSize() {
		return this.size;
	}
	public VehicleType getVechileType() {
		return this.vechileType;
	}

	public String getVechileNumber() {
		return this.vechileNumber;
	}
}


