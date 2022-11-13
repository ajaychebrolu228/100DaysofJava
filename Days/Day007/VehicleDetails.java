public class VehicleDetails {
	public static void main(String args[]) {
		Vehicle bike = new Vehicle();
		bike.passengers = 3;
		bike.print("bike");
		Vehicle car = new Vehicle();
		car.passengers = 5;
		car.print("car");
		Vehicle auto = new Vehicle();
		auto.passengers = 10;
		auto.print("Auto");
		
	}
}
class Vehicle {
	int passengers;
	void print(String vehicle){
		System.out.println("Number of passengers in "+vehicle+" are "+passengers);
	}
}
