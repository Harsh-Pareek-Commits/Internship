package new_flight;

import java.time.LocalDateTime;

public class International extends Flight {

	

	public International(String flightNumber, String airliner, String source, LocalDateTime flyDateTime,
			String destination, LocalDateTime arrivalDateTime, boolean flyType, int internationFlyTax, int baseFare) {
		super(flightNumber, airliner, source, flyDateTime, destination, arrivalDateTime, flyType, internationFlyTax, baseFare);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculateCost() {
		this.setHoliday_tax(this.getBaseFare() * checkHoliday(this.getArrivalDateTime()));
		this.setTime_tax(this.getBaseFare() * checkTime(this.getArrivalDateTime()));
		this.setNon_friendly_tax(0.0f);
		
		if (!checkCountry(this.getDestination())) {
			this.setNon_friendly_tax(this.getBaseFare()* (0.3));
		}
		this.setFinalCost((int) (this.getBaseFare() + this.getHoliday_tax() + this.getTime_tax() + this.getNon_friendly_tax()));
		return this.getFinalCost();
	}
	
}
