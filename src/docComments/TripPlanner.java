package docComments;

/**
 * Calculates the amount of fuel</br> 
 * required for a particular car.
 * @author chantay
 */
public class TripPlanner {
	private String departure;
	private String arrival;
	private int distance;
	private Car car;
	
	/**
	 * 
	 * Constructor of the class TripPlanner
	 * 
	 * @param departure
	 * @param arrival
	 * @param distance
	 * @param car
	 */
	public TripPlanner(String departure, String arrival, int distance, Car car) {
		this.departure = departure;
		this.arrival = arrival;
		this.distance = distance;
		this.car = car;
	}
	
	/**
	 * Returns the number of gallons</br> 
	 * required for the trip.
	 * @return
	 */
	public double fuelConsumption() {
		double mpg = (double) car.getMpg();
		double gallons = distance / mpg;
		return gallons;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TripPlanner [departure=" + departure + ", arrival=" + arrival + ", distance=" + distance + ", car="
				+ car.getModel() + "]";
	}
}
