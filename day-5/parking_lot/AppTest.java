import Floor.*;
import Vehicle.*;

public class AppTest {
	public static void main(String[] args) {
		System.out.println("Welcome to our parking Area");
		Floor floor1 = new Floor(2, 3);
		floor1.setLevel(0);
		Floor floor2 = new Floor(2, 5);
		floor2.setLevel(1);
		ParkingLot parkingLot = new ParkingLot();
		parkingLot.addFloor(floor1);
		parkingLot.addFloor(floor2);
		Vehicle bus1 = new Bus("123");
		
		parkingLot.parkVehicle(bus1);
		//parkingLot.printParkingView();

		Vehicle bike1 = new Bike("234");
		parkingLot.parkVehicle(bike1);
		//parkingLot.printParkingView();

		Vehicle car1 = new Car("23");
		parkingLot.parkVehicle(car1);
		parkingLot.printParkingView();

		Vehicle car2 = new Car("29090");
		parkingLot.parkVehicle(car2);
		//parkingLot.printParkingView();
		

		Vehicle bus2 = new Bus("1238989");
		parkingLot.parkVehicle(bus2);
		//parkingLot.printParkingView();

		Vehicle bus3 = new Bus("1i238989");
		parkingLot.parkVehicle(bus3);
		parkingLot.printParkingView();

		// Block block = parkingLot.parking.get(0).location.get(0).get(0);
		// block.setBlockStatus(true);
		// System.out.println("##################################");
		// parkingLot.printParkingView();
	}
}