package question4;

public class Car {

	private String model;
	private String companyName;
	private String Color;
	Engine engine;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}

	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public Car() {
		super();
	}
	
	public Car(String model, String companyName, String color, Engine engine)
	{
		super();
		this.model = model;
		this.companyName= companyName;
		this.Color= color;
		this.engine = engine;
	}
}
