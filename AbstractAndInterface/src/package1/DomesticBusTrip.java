package package1;

public class DomesticBusTrip extends TravelPlan implements Passenger {
	private String departure;
	private String destination;
	private String travelDate;
	
	public DomesticBusTrip(String departure,String destination, String travelDate) {
		super(departure,destination,travelDate);
		this.departure = departure;
		this.destination = destination;
		this.travelDate = travelDate;
	}
	
	public void displayPassengerInfo(String name, String ticketNumber) {
		System.out.println("The passenger's name is: " + name + ". The ticket number is: " + ticketNumber);
	}

	public void showTravelDetails() {
		System.out.println("The departure date is: " + departure + ". The destination is: " + destination + ". The date of travel is: " + travelDate);	
	}
}
