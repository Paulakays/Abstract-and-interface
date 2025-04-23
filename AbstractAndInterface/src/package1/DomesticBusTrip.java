package package1;

public class DomesticBusTrip extends TravelPlan implements Passenger {
	
	
	public DomesticBusTrip(String departure, String destination, String travelDate) {
		super(departure,destination,travelDate);
		
	}
	
	@Override
	public void showTravelDetails() {
		System.out.println("Domestic Bus Trip");
		System.out.println("The place of departure is: " + departure + ". The destination is: " + destination + ". The date of travel is: " + travelDate);	
	}
	
	@Override
	public void displayPassengerInfo(String name, String idNumber) {
		System.out.println("The passenger's name is: " + name + ". The ID number is: " + idNumber);
	}

	
}
