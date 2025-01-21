package docComments;

public class Car {
	
	private String make;
	private String model;
	private int mpg;
	
	/**
	 * 
	 * Constructor initializes the fields
	 * 
	 * @param make   make of the car
	 * @param model  model of the car
	 * @param mpg    miles per gallon the car gets
	 */
	public Car(String make, String model, int mpg) {
		this.make = make;
		this.model = model;
		this.mpg = mpg;
	}

	/**
	 * Returns the make of the car.
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * Returns the model of the car.
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * Returns the miles per gallon the car gets.
	 * @return the mpg
	 */
	public int getMpg() {
		return mpg;
	}
	
}
