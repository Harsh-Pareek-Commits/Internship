package new_flight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
		List<Flight> flights = new ArrayList<>();
		Scanner tp = new Scanner(System.in);
		String flight_num;
		int flightnum = 0;
		int choice = 0;
		while (choice != 6) {
			System.out.println("\n===============================================================");
			System.out.println("\n Please select one of the options");
			System.out.println("1)Insert new flight ");
			System.out.println("2)Delete a flight");
			System.out.println("3)Print all the flights");
			System.out.println("4)Search flight");
			System.out.println("5)Change Fare");
			System.out.println("6)Exit");
			System.out.println("Enter your choice: ");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				flightInsertion(flightnum, flights);
				flightnum++;
				break;
			case 2:
				System.out.println("Please enter the flight number to be deleted: ");
				flight_num = tp.nextLine();
				 flightDeletion(flight_num, flights);
				break;
			case 3:
				FlightDetails prt = new FlightDetails();
				for (Flight ft : flights) {
				 prt.printFlightDetails(ft);

				}
				break;
			case 4:
				System.out.println("Please enter the flight number to be searched: ");
				tp = new Scanner(System.in);
				flight_num = tp.nextLine();
				// flightSearch(flight_num, flights);
				break;
			case 5:
				System.out.println("Please enter the flight number : ");
				flight_num = tp.nextLine();

				System.out.println("Please enter new basefare: ");
				String newfare = tp.nextLine();
				// changeFare(flight_num, flights,newfare);
				break;
			case 6:
				System.out.println("=====THANK YOU FOR USING TRAVEL APP====== ");
				break;
			default:
				System.out.println("Invalid selection");

			}
		}

	}

	public static void flightInsertion(int fn, List<Flight> x) {

		String str = "2021-01-26 11:30";
		String str2 = "2021-01-26 06:30";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime arr = LocalDateTime.parse(str, formatter);
		LocalDateTime dept = LocalDateTime.parse(str2, formatter);
		Domestic flight = new Domestic("G6-0" + fn, "h", "Delhi", dept, "Mum", arr, true, 500, 2000);
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
       fn++;
		x.add(flight);
		System.out.println("Flight Created");
	}
	
	
	public static void flightDeletion(String fn, List<Flight> x) {
		int flag=0;
			if ((x!= null)) {
            for(Flight f:x) {
				if (f.getFlightNumber().equals(fn)) {
					flag=1;
					System.out.println("Flight " + fn + " is deleted");
					//x.remove(f);
					
				}
			}
			}
		
		if(flag==0)
			System.out.println("No Flight found");

	
	}

}
