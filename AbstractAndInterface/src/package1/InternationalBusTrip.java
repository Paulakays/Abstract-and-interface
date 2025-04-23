package package1;

public class InternationalBusTrip extends TravelPlan implements Passenger{
	
	
	public InternationalBusTrip(String departure,String destination, String travelDate) {
		super(departure,destination,travelDate);
		
	}
	@Override
	public void showTravelDetails() {
		System.out.println("International Bus Trip");
		System.out.println("Departure date: " + departure + ". Destination: " + destination + ". Date of travel: " + travelDate);	
	}
	@Override 
	public void displayPassengerInfo(String name, String passportNumber) {
		System.out.println("Passenger name: " + name + ". Passport  number: " + passportNumber);
	}
	
	
}
