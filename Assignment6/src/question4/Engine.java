package question4;

public class Engine {

	int rmp;
	int power;
	String manufacturer;
	boolean hasTurbo = false;
	
	
	
	public int getRmp() {
		return rmp;
	}
	public void setRmp(int rmp) {
		this.rmp = rmp;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public boolean getHasTurbo()
	{
		return hasTurbo;
	}
	
	public void setHasturbo(boolean hasTurbo)
	{
		this.hasTurbo = hasTurbo;
	}
	
	public Engine()
	{
		super();
	}
	
	public Engine(int rmp, int power, String manufacturer, boolean hasTurbo)
	{
		super();
		this.rmp = rmp;
		this.power = power;
		this.manufacturer = manufacturer;
		this.hasTurbo = hasTurbo;
		
	}
	
	void hasTurbo() 
	{
		this.hasTurbo = true;
	}
	
}
