package docComments;

public class TravelApp {

	public static void main(String[] args) {
		Car m4 = new Car("BMW", "M4", 25);
		Car civic = new Car("Honda", "Civic", 42);
		
		System.out.println("Cars");
		System.out.printf("%s %s %d mpg", m4.getMake(), m4.getModel(), m4.getMpg());
		System.out.printf("%n%s %s %s mpg", civic.getMake(), civic.getModel(), civic.getMpg());
		
		TripPlanner californiaTrip = new TripPlanner("SF", "LA", 382, m4);
		TripPlanner floridaTrip = new TripPlanner("Tampa", "Miami", 280, civic);
		
		System.out.printf("%n%n");
		System.out.println("California Trip:");
		System.out.println(californiaTrip);
		double caliRoundedFuelConsumption =  Math.round(californiaTrip.fuelConsumption() * 10.0) / 10.0;
		System.out.printf("Fuel consumption: %s gallons", caliRoundedFuelConsumption);
		
		System.out.printf("%n%n");
		System.out.println("Florida Trip:");
		System.out.println(floridaTrip);
		double floridaRoundedFuelConsumption =  Math.round(floridaTrip.fuelConsumption() * 10.0) / 10.0;
		System.out.printf("Fuel consumption: %s gallons", floridaRoundedFuelConsumption);
	}
}
