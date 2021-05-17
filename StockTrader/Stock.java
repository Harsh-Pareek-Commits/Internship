package StockTrader;

public class Stock {

	private String stockName; // infosys
	private int stockPrice;  // 1300
	
	
	public Stock(String name, int price) {
		stockName = name;
		stockPrice = price;
	}
	
	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(int stockPrice) {
		this.stockPrice = stockPrice;
	}

	public void changePrice(float percentageChange,boolean action)
	{   
		float changeIn_Amt= stockPrice*(percentageChange/100);
		int newPrice=getStockPrice();
		if(action)
		{
			newPrice=newPrice+ (int)(changeIn_Amt);
			
		}
		else {
			newPrice=newPrice+(int)(changeIn_Amt);
		}
		setStockPrice(newPrice);
		CurrentPrice();
	}
	public void CurrentPrice(){
		System.out.println("===Current Price===");
		System.out.println("Stock Name: "+getStockName());
		System.out.println("Stock Price: "+getStockPrice());
	}
	
}
