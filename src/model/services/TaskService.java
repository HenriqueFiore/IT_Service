package model.services;

public class TaskService {
	private double[] price;
	private int size;
	private TaxService texService;
	
	public TaskService(double[] price, int size,TaxService texService) {
		this.price = price;
		this.size = size;
		this.texService = texService;
	}
	
	
	
}
