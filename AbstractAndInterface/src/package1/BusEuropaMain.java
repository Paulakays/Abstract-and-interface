package package1;

public class BusEuropaMain {
	public static void main (String[]args) {
		DomesticBusTrip domesticTrip = new DomesticBusTrip("Munich","Schiphol","4th May");
		InternationalBusTrip internationalTrip = new InternationalBusTrip("Nairobi","Mombasa", "12th December");
		
		domesticTrip.displayPassengerInfo("Mary", "AK47");
		domesticTrip.showTravelDetails();
		internationalTrip.displayPassengerInfo("Stacey","MK14");
		internationalTrip.showTravelDetails();
	}
}
