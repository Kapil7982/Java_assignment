package question5;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FuelCar fuelCar = new FuelCar();
		fuelCar.run();
		fuelCar.service();
	
		
		ElectricCar ecl = new ElectricCar();
		ecl.run();
		ecl.service();
	}

}
