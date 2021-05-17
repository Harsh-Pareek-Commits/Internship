package StockTrader;

public class StockTrackingApp {

	public static void main(String[] args) {
	Stock infy=new Stock("Infosys",1375);
	Stock adani=new Stock("ADANI PORT",680);
	infy.CurrentPrice();
	System.out.println("\nINFY Price incresed\n ");
	infy.changePrice(5, true);
	System.out.println("\nADANI PORT OBJECT CREATED\n ");
	adani.CurrentPrice();
	System.out.println("\nADANI Price decresed\n ");
	adani.changePrice(13, false);
	System.out.println("\nADANI Price Increased\n ");
	adani.changePrice(8, true);
			
	}

}