package Vehicle;

public class Car extends Vehicle {
	//public VehicleType vechileType = VehicleType.CAR;
	public Car(String vechileNumber) {
		this.vechileNumber = vechileNumber;
		this.size = 2;
		this.vechileType = VehicleType.CAR;
	}
}