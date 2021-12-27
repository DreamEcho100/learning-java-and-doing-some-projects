import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choosedVehicleIndex;
		
		Car car1 = new Car();
		Bicycle bicycle1 = new Bicycle();
		Boat boat1 = new Boat();
		
		Vehicle[] racers = {car1, bicycle1, boat1};
		
		for (Vehicle vehicle : racers ) {
			vehicle.go();
		}
		
		System.out.println("Choose a vehicle to go!!!");
		System.out.print("(car = 1) - (bicycle = 2) - (boat = 3)");
		choosedVehicleIndex = scan.nextInt() - 1;
		
		if (choosedVehicleIndex >= 0 && choosedVehicleIndex <= racers.length) {
			racers[choosedVehicleIndex].go();
		} else {
			System.out.println("Vehicle doesn't exist :(");
		}
		
		scan.close();
	}

}
