
public class Car {
	private String make;
	private String model;
	private int year;
	
	public Car(String make, String model, int year) {
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	}
	
	public Car(Car c) {
		this.copy(c);
	}

	public String getModel() {
		return model;
	}

	public String getMake() {
		return make;
	}

	public int getYear() {
		return year;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void copy(Car c) {
		this.setMake(c.make);
		this.setModel(c.model);
		this.setYear(c.year);
	}
}
