package package1;

public abstract class TravelPlan {
	private String departure;
	private String destination;
	private String travelDate;
	
	public TravelPlan (String departure,String destination,String travelDate) {
		this.departure = departure;
		this.destination = destination;
		this.travelDate = travelDate;
	}	
	public abstract void showTravelDetails();
}