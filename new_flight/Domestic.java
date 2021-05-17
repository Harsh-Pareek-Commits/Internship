package new_flight;

import java.time.LocalDateTime;

public class Domestic extends Flight {

	
	public Domestic(String flightNumber, String airliner, String source, LocalDateTime flyDateTime, String destination,
			LocalDateTime arrivalDateTime, boolean flyType, int internationFlyTax, int baseFare) {
		super(flightNumber, airliner, source, flyDateTime, destination, arrivalDateTime, flyType, internationFlyTax, baseFare);
		
	}

	@Override
	public int calculateCost() {
		this.setHoliday_tax(this.getBaseFare() * checkHoliday(this.getArrivalDateTime()));
		this.setTime_tax(this.getBaseFare() * checkTime(this.getArrivalDateTime()));
		this.setNon_friendly_tax(0.0f);
	
		this.setFinalCost((int) (this.getBaseFare() + this.getHoliday_tax() + this.getTime_tax() + this.getNon_friendly_tax()));
		return this.getFinalCost();
	}

}
