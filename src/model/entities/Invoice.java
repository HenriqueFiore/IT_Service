package model.entities;

public class Invoice {
	private double basicPrice;
	private double tax;
	
	public Invoice(){}

	public Invoice(double basicPrice, double tax) {
		this.basicPrice = basicPrice;
		this.tax = tax;
	}

	public double getBasicPrice() {
		return basicPrice;
	}

	public void setBasicPrice(double basicPrice) {
		this.basicPrice = basicPrice;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double fullPrice() {
		return getBasicPrice() + getTax();
	}
	
}
