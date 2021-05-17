package Flight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
		Flight f[] = new Flight[10];
		Scanner tp = new Scanner(System.in);
		String flight_num;
		int flightnum = 0;
		int choice=0;
		while (choice!=6) {
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
				flightInsertion(flightnum, f);
				flightnum++;
				break;
			case 2:
				System.out.println("Please enter the flight number to be deleted: ");
				flight_num = tp.nextLine();
				flightDeletion(flight_num, f);
				break;
			case 3:
				FlightDetails prt = new FlightDetails();
				for (Flight ft : f) {
					if (ft != null)
						prt.printFlightDetails(ft);

				}
				break;
			case 4:
				System.out.println("Please enter the flight number to be searched: ");
				 tp = new Scanner(System.in);
				 flight_num = tp.nextLine();
				flightSearch(flight_num, f);
				break;
			case 5:
				System.out.println("Please enter the flight number : ");
				flight_num = tp.nextLine();
				
				System.out.println("Please enter new basefare: ");
				String newfare= tp.nextLine();
				changeFare(flight_num, f,newfare);
				break;
			case 6:
				System.out.println("=====THANK YOU FOR USING TRAVEL APP====== ");
				break;
			default:
				System.out.println("Invalid selection");
				
			}
		} 

	}

	public static void flightInsertion(int fn, Flight x[]) {
		if (fn > 9) {
			System.out.println("Sorry we dont have space for new flight \n");
		} else {
			String str = "2021-01-26 11:30";
			String str2 = "2021-01-26 06:30";
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
			LocalDateTime arr = LocalDateTime.parse(str, formatter);
			LocalDateTime dept = LocalDateTime.parse(str2, formatter);
			Flight flight = new Flight("G6-0" + fn, "h", "Delhi", dept, "Mum", arr, true, 500, 2000);
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

			x[fn] = flight;
			System.out.println("Flight Created");
		}
	}

	public static void flightDeletion(String fn, Flight x[]) {
		int index = 0,flag=0;
		for (int i = 0; i < x.length; i++) {
			if ((x[i] != null)) {

				if (x[i].getFlightNumber().equals(fn)) {
					flag=1;
					System.out.println("Flight " + fn + " is deleted");
					continue;
				}
			}
			x[index] = x[i];
			index++;
		}
		if(flag==0)
			System.out.println("No Flight found");

	}
	public static void flightSearch(String fn, Flight x[]) {
		for (Flight ft:x) {
			if ((ft != null)) {
				
				if (ft.getFlightNumber().equals(fn)) {
					FlightDetails prt = new FlightDetails();
					prt.printFlightDetails(ft);
				}
				else {
					System.out.println("No Flight found");
				}
			}
			
		}

	}
	public static void changeFare(String fn, Flight x[],String fare) {
		for (Flight ft:x) {
			if ((ft != null)) {
				
				if (ft.getFlightNumber().equals(fn)) {
					ft.setBaseFare(Integer.parseInt(fare));
					ft.calculateCost();
				}
				else {
					System.out.println("No Flight found");
				}
			}
			
		}

	}
}
