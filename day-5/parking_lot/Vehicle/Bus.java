package Vehicle;

public class Bus extends Vehicle {
	public Bus(String vechileNumber) {
		this.vechileNumber = vechileNumber;
		this.size = 5;
		this.vechileType = VehicleType.BUS;
	}
}