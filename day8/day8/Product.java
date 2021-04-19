package day8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Product {
	private String productName;
	private int productCost;
	private int startRating;
	private LocalDate manufacturingDate;
	public Product(String productName, int productCost, int startRating) {
		super();
		this.productName = productName;
		this.productCost = productCost;
		this.startRating = startRating;
		this.manufacturingDate=LocalDate.now();
	}
	public void displayProd(Product p) {
		System.out.println("Product name "+p.getProductName());
		System.out.println("Price " +p.getProductCost());
		System.out.println("Rating "+p.startRating);
		System.out.println("Manufacturing Date "+p.getManufacturingDate());
		
	}
	
	
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductCost() {
		return productCost;
	}
	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}
	public int getStartRating() {
		return startRating;
	}
	public void setStartRating(int startRating) {
		this.startRating = startRating;
	}
	public LocalDate getManufacturingDate() {
		return manufacturingDate;
	}
	public void setManufacturingDate(LocalDate manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((manufacturingDate == null) ? 0 : manufacturingDate.hashCode());
		result = prime * result + productCost;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + startRating;
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (manufacturingDate == null) {
			if (other.manufacturingDate != null)
				return false;
		} else if (!manufacturingDate.equals(other.manufacturingDate))
			return false;
		if (productCost != other.productCost)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (startRating != other.startRating)
			return false;
		return true;
	}
	
	
}
