package quesiton4;

public class CPU {

	private String manufacturer;
	private String processor;
	private double clockSpeed;
     
     public CPU() {
	
     }

	public CPU(String manufacturer, String processor, double clockSpeed) {
		super();
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.clockSpeed = clockSpeed;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public double getClockSpeed() {
		return clockSpeed;
	}

	public void setClockSpeed(double clockSpeed) {
		this.clockSpeed = clockSpeed;
	}
}
