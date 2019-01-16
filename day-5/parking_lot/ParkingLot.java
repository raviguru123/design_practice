import Floor.*;
import Vehicle.*;
import java.util.*;

public class ParkingLot {
	int floorCount = 0;
	public HashMap<Integer, Floor> parking;
	public HashMap<String, Location> vehicles;

	public ParkingLot() {
		this.parking = new HashMap<Integer, Floor>();
		this.vehicles = new HashMap<String, Location>();
	}

	public void addFloor(Floor floor) {
		if(this.parking.containsKey(floor.getLevel())) {
			System.out.println("Floor Number "+floor.getLevel() + " Already Exit");
		}
		else {
			this.parking.put(floor.getLevel(), floor);
			this.floorCount += 1;
		}
		
	}
	public Floor getFloor(int level) {
		if(this.parking.containsKey(level)) {
			return this.parking.get(level);
		}
		else {
			System.out.println("We don't have floor:: "+ level);
			return null;
		}
	}
	public Location _getFreeLocation(Vehicle vehicle) {

		for(int floor = 0; floor < floorCount; floor++) {
			//System.out.println("Search"+floor);
			Block block = this.parking.get(floor).searchFreeSpace(vehicle);
			if(block != null) {
				return new Location(floor, block);
			}
		}
		return null;
	}

	public boolean _checkFreeSpace(Vehicle vehicle) {
		Location location = this._getFreeLocation(vehicle);
		if(location != null) {
			System.out.println(vehicle.vechileType+ " and Number "+vehicle.vechileNumber+" Location Available Floor number::"+location.floor +" And row number:: "+ location.block.row +" and column number:: "+ location.block.col);
			return true;
		}
		System.out.println("Sorry we don't have Available Space for your Vehicle");
		return false;
	}

	public void _parkVehicle(Location location, Vehicle vehicle) {
		location.setVehicle(vehicle);
		this.parking.get(location.floor).fillFreeSpace(location.block, vehicle);
		this.vehicles.put(vehicle.vechileNumber, location);
	}

	public void parkVehicle(Vehicle vehicle) {
		if(_checkFreeSpace(vehicle)) {
			Location location = this._getFreeLocation(vehicle);
			this._parkVehicle(location, vehicle);
		}
		else {
			System.out.println("OOP'S we don't have Block size for your vehicle");
		} 
	}

	public boolean _isVechileExits(Vehicle vehicle) {
		if(this.vehicles.containsKey(vehicle.vechileNumber)) {
			return true;
		}
		return false;
	}

	public void removeVehicle(Vehicle vehicle) {
		if(this._isVechileExits(vehicle)) {
			Location location = this.vehicles.get(vehicle.vechileNumber);
			this.vehicles.remove(vehicle.vechileNumber);
			this.parking.get(location.floor).removeVehicle(location.block, vehicle);
			System.out.println("System out. println vehicle is remove from our parking area floor number::"+ location.floor + " and row number:: "+location.block.row + " column number :: "+location.block.col);
		}
		else {
			System.out.println("Sorry we don't have your vehicle in our parking area");
		}
	}

	public void printParkingView() {
		System.out.println("\n");
		for(int floornum = 0; floornum < this.floorCount; floornum++) {
			Floor floor = this.parking.get(floornum);

			for(int row = 0; row < floor.row; row++) {
				for(int col= 0; col < floor.col; col++) {
					Block block = floor.getBlock(row,col);
					if(block.getBlockStatus()) {
						System.out.print("1 ");
					}
					else {
						System.out.print("0 ");
					}
				}
				System.out.println();
			}
			System.out.println("******************************");

		}
	}
	
}