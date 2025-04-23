package package1;

public class BusEuropaMain {
	public static void main (String[]args) {
		TravelPlan trip1= new DomesticBusTrip("Munich","Schiphol","4th May");
		trip1.showTravelDetails();
		((Passenger)trip1).displayPassengerInfo("Mark", "AK47");
		
		TravelPlan trip2= new InternationalBusTrip("Nairobi","Mombasa", "12th December");
		trip2.showTravelDetails();
		((Passenger)trip2).displayPassengerInfo("Mary", "ZT789");
	
	}
}
