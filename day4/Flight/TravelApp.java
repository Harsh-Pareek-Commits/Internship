package Flight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TravelApp {

	public static void main(String[] args) {
		/* Write code to call Flight constructor and Flight class setter methods */
		/*
		 * Flight flight = null;
		 * 
		 * 
		 * FlightDetails flightDetails = new FlightDetails();
		 * flightDetails.printFlightDetails(flight);2021, 1, 26
		 */
		String str = "2021-01-26 11:30";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime arr = LocalDateTime.parse(str, formatter);
		Flight flight = new Flight("G6123", "h", "Delhi", arr, "Mum", arr, true, 500, 2000);
		flight.calculateCost();
		int number_of_haults = 2;
		if (number_of_haults > 0) {
			Hault[] ht = new Hault[number_of_haults];
			for (int i = 0; i < number_of_haults; i++) {
				Hault temp = new Hault();
				temp.setAirportName("Delhi");
				temp.setDuration(2);
				ht[i] = temp;
			}
			flight.setHault(ht);
		}

		FlightDetails fp = new FlightDetails();
		fp.printFlightDetails(flight);
	}

}
