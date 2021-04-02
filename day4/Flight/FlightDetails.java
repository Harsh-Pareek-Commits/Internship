package Flight;

public class FlightDetails {

	public void printFlightDetails(Flight flight)
	{
		/* Write code to print the flight information and fare break up*/
		System.out.println("Flight Number: "+flight.getFlightNumber());
		System.out.println("Airliner: "+flight.getAirliner());
		System.out.println("Destination: "+flight.getDestination());
		System.out.println("Arrival"+flight.getSource());
		System.out.println("Arrival Date and time"+flight.getArrivalDateTime());
		System.out.println("Haults");
		for(Hault ht:flight.getHault()) {
			System.out.println("Airport: "+ht.getAirportName());
			System.out.println("Duration:"+ht.getDuration());
		}
		System.out.println("Base Fare: "+flight.getBaseFare());
		System.out.println("Final Fare: "+flight.getFinalCost());
		
	}
}
