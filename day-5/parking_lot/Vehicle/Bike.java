package Vehicle;

public class Bike extends Vehicle {
	// public VehicleType vechileType = VehicleType.BIKE;
	public Bike(String vechileNumber) {
		this.vechileNumber = vechileNumber;
		this.size = 1;
		this.vechileType = VehicleType.BIKE;;
	}
}