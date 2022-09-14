package question4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car("Harrier", "Tata", "black", new Engine(10000,110,"tata", true));
		
		
		System.out.println("Car Model :" + car.getModel());
		System.out.println("Car companyName :" + car.getCompanyName());
		System.out.println("Car color :" + car.getColor());
		System.out.println("Car RPM :" + car.engine.getRmp());
		System.out.println("Car power :" + car.engine.getPower());
		System.out.println("Car Engine Manufacture :" + car.engine.getManufacturer());
		System.out.println("Car Has Turbo :" + car.engine.getHasTurbo());
		
		
		
		System.out.println("--------------------------------Next------------------------------------");
		
		Car c1 = new Car();
		c1.setModel("Nexon");
		c1.setCompanyName("Tata");
		c1.setColor("blue");
		c1.setEngine(new Engine());
		c1.engine.setRmp(15000);
		c1.engine.setPower(150);
		c1.engine.setManufacturer("Tata");
		c1.engine.setHasturbo(false);
		
		
		System.out.println("Car Model :" + c1.getModel());
		System.out.println("Car companyName :" + c1.getCompanyName());
		System.out.println("Car color :" + c1.getColor());
		System.out.println("Car RPM :" + c1.engine.getRmp());
		System.out.println("Car power :" + c1.engine.getPower());
		System.out.println("Car Engine Manufacture :" + c1.engine.getManufacturer());
		System.out.println("Car Has Turbo :" + c1.engine.getHasTurbo());
		
		
		
		
		
		
		
	}

}
