package model.services;

import model.entities.Task;
import model.entities.Invoice;

public class TaskService {
	private double price;
	private int size;
	private TaxService taxService;
	
	public TaskService(double price, int size,TaxService taxService) {
		this.price = price;
		this.size = size;
		this.taxService = taxService;
	}
	
	public double getPrice() {
		return price;
	}

	public int getSize() {
		return size;
	}

	public void processInvoice(Task task) {
		
		double tax = taxService.tax(price, size);
		task.setInvoice(new Invoice(price, tax));
		
	}
	
}
