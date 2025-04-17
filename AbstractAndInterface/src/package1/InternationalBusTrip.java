package package1;

public class InternationalBusTrip extends TravelPlan implements Passenger{
	private String departure;
	private String destination;
	private String travelDate;
	
	public InternationalBusTrip(String departure,String destination, String travelDate) {
		super(departure,destination,travelDate);
		this.departure = departure;
		this.destination = destination;
		this.travelDate = travelDate;
	}
	
	public void displayPassengerInfo(String name, String ticketNumber) {
		System.out.println("Passenger name: " + name + ". Ticket  number: " + ticketNumber);
	}
	
	public void showTravelDetails() {
		System.out.println("Departure date: " + departure + ". Destination: " + destination + ". Date of travel: " + travelDate);	
	}
}
